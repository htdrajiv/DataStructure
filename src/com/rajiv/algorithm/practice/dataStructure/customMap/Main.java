package com.rajiv.algorithm.practice.dataStructure.customMap;

/**
 * Created by Rajiv on 7/19/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MyMap<Integer,String> myMap = new MyMap<>();
        myMap.put(10,"first value");
        myMap.put(20,"second value");
        myMap.put(30,"third value");
        myMap.put(40,"forth value");
        myMap.put(50,"fifth value");
        myMap.put(60,"sixth value");
        myMap.delete(40);
        System.out.println(myMap.get(10));
        System.out.println(myMap.get(40));
        System.out.println(myMap.get(50));
    }
}
