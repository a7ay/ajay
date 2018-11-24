package module1;

public class localHashMap<K,V> implements localAbstractMap<K,V> {

    private localHashMap.ll[] abc = new localHashMap.ll[100];

    @Override
     public void clear () {
        for (int i=0; i< abc.length; i++) {

            if (abc[i] != null) {

                ll prev =  abc[i];
                ll current = prev;

                while (current != null ) {
                    current  = prev.next;
                    prev.next=null;
                }
            }
            abc[i]=null;
        }
     }

     @Override
     public boolean containsKey(K key) {

        if (key == null || get(key) == null) {
            return false;
        } else {
            return true;
        }
     }

     @Override
     public V get(K key) {

         int location = key.hashCode() % abc.length;
         ll start =  abc[location];

         //find the item in the list
         //ensure not tyring to add a duplicate
         while (start != null ) {

             if (start.key.equals(key)) {
                 System.out.println("Found a matching key");
                 return start.value;
             }
             start = start.next;
         }

         System.out.println("key not found " + key);
         return null;
    }

    @Override
    public V set(K key, V value) {

        int location = key.hashCode() % abc.length;
        ll current = abc[location];

        //add new item
        ll item = new ll(key,value);

        if (current == null) {
            abc[location] = item;
            return value;
        }

        //find the item in the list
        //ensure not tyring to add a duplicate
        ll prev;
        do  {

            prev=current;
            if (current.key.equals(key)) {
                 System.out.println("Trying to set a duplicate for this key") ;
                 return current.value;
            }

            current=current.next;
        } while (current != null);

        prev.next=item;

        System.out.println(key+ " " + value + " " + location );

        return value;
    }

    @Override
    public int size() {

        int sz=0;
        ll current;

        for (int i=0; i< abc.length; i++) {

            if (abc[i] != null) {

                current =  abc[i];
                while (current != null ) {
                    sz++;
                    current  = current.next;
                }
            }
        }

        return sz;
     }

     public V remove (K key) {

         int location = key.hashCode() % abc.length;

         for (int i=0; i< abc.length; i++) {

             if (abc[i] != null) {

                 ll prev = abc[i];
                 ll current = prev;

                 while (current != null) {

                     if (current.key.equals(key)) {
                         if (prev.equals(current)) {
                             abc[location]=current.next;
                         } else {
                             prev.next = current.next;
                             current.next=null;
                         }
                         return current.value;
                     }
                     prev = current;
                     current = current.next;
                 }
             }
         }
         return null;
     }

    private class ll {
        private  V value;
        private K key;
        private ll next;

        ll (K k, V v)  {
            key = k;
            value = v;
            next = null;
        }
    }
}