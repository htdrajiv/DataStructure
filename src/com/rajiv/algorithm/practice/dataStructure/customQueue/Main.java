package com.rajiv.algorithm.practice.dataStructure.customQueue;

/**
 * Created by Rajiv on 7/21/2016.
 */
public class Main {
    public static void main(String[] args){
        MyQueue<String> myQueue = new MyQueue<>();
        myQueue.inQueue("first element");
        myQueue.inQueue("second element");
        myQueue.inQueue("third element");
        myQueue.inQueue("forth element");
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        System.out.println(myQueue.deQueue());
        myQueue.inQueue("third element");
        myQueue.inQueue("forth element");
        System.out.println(myQueue.peek());
    }
}
