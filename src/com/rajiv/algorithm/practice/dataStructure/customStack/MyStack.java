package com.rajiv.algorithm.practice.dataStructure.customStack;

import java.util.Arrays;

/**
 * Created by Rajiv on 7/20/2016.
 */
public class MyStack <T> {
    private T stack[] = (T[]) new Object[2];
    private int count = 0;
    private int index = 1;

    public void push(T input){
        checkSizeToPush();
        stack[count] = input;
        count++;
    }

    public T peek(){
        checkForPeekPopException();
        while(stack[(stack.length)-index]==null){
            index ++;
        }
        return stack[(stack.length)-index];
    }

    public T pop(){
        T result = peek();
        stack[(stack.length)-index] = null;
        count--;
        checkSizeAfterPop();
        return result;
    }

    public void checkSizeToPush(){
        if(count==stack.length){
            stack = Arrays.copyOf(stack, count * 2);
        }
    }

    public void checkSizeAfterPop(){
        if(stack.length>2 && stack.length/2==count){
            stack = Arrays.copyOf(stack,count);
            index = 1;
        }
    }

    public void checkForPeekPopException(){
        if(index>stack.length){
            throw new ArrayIndexOutOfBoundsException("No element in the stack to pop or peek.");
        }
    }
}
