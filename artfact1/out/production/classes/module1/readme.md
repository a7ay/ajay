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



