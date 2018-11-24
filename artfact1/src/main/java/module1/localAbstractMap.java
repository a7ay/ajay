package module1;

public  interface localAbstractMap<K,V> {

    //No need to add abstract keyword to each method as it is redundant
    //No need to add public modifier, everything is publlic
    void clear ();

    boolean containsKey(K key);

    V get(K key);

    V set (K key, V value);

    int size();

    V remove (K key);
}
