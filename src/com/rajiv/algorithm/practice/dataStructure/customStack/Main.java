package com.rajiv.algorithm.practice.dataStructure.customStack;

/**
 * Created by Rajiv on 7/20/2016.
 */
public class Main {
    public static void main(String[] args){
        MyStack<String> myStack = new MyStack<>();
        myStack.push("first element");
        myStack.push("second element");
        myStack.push("third element");
        myStack.push("forth element");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.push("fifth element");
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
}
