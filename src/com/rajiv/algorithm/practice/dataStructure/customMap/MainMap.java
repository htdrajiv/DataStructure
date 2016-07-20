package com.rajiv.algorithm.practice.dataStructure.customMap;

/**
 * Created by Rajiv on 7/19/2016.
 */
public class MainMap <K,V> {
    private K key;
    private V value;

    public K getKey(){return key;}
    public V getValue(){return value;}

    public void setKey(K key){this.key = key;}
    public void setValue(V value){this.value=value;}
}
