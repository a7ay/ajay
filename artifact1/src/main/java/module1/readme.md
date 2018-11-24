# Basic HashMap

This datastrucuture is best for storing small amount of data that needs to be searched by a key
Lookup time will Big 0 (n/x)  where n is total size and x is number of buckets. This assumes distribution of data is even.

Top level array is initialized to number of buckets, and each bucket has a linked list.

# Lessons Learnt
## keyword abstract is redundant in the snippet below

```java
public abstract interface localAbstractMap<K,V> {
}
```

## If you are implementing a generic interface your class needs to be generic too

```java
public  interface localAbstractMap<K,V> {
}

public class localHashMap<K,V> implements localAbstractMap<K,V> {
}
```

## Your generic class can have more types than the implemented interface

```java
public  interface localAbstractMap<K,V> {
}

public class localHashMap<K,V,N> implements localAbstractMap<K,V> {
}
```

## Methods in an interface can only have public scope. Implementing class must specify this scope

```java
public  interface localAbstractMap<K,V> {

    void clear ();
  
    V remove (K key);
}
```

## inner classes are either be static or non-static. you are not allowed to create an array of non-static class. To workaround, treat non-static class as static by referring to them through the outer class. Learn more: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

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
