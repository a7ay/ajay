#Basic HashMap

Implemented using an Array & Linkedlist.
A maximum of 100 slots allocated for storing data


# Lessons
## keyword abstract is redundant in the snippet below

```java
public abstract interface localAbstractMap<K,V> {
}
```

##If you are implementing a generic interface your class needs to be generic too

```java
public  interface localAbstractMap<K,V> {
}

public class localHashMap<K,V> implements localAbstractMap<K,V> {
}
```

##Your generic class can have more types than the implemented interface

```java
public  interface localAbstractMap<K,V> {
}

public class localHashMap<K,V,N> implements localAbstractMap<K,V> {
}
```

##Methods in an interface can only have public scope. Implementing class must specify this scope

```java
public  interface localAbstractMap<K,V> {

    void clear ();
  
    V remove (K key);
}
```

##inner classes are either be static or non-static. you are not allowed to create an array of 
##of non-static class. Read more here : https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
##to work around, treat non-static class as static by referring to them through the outer class

```java
public class localHashMap<K,V> implements localAbstractMap<K,V> {

    private localHashMap.ll[] abc = new localHashMap.ll[100];

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
```



