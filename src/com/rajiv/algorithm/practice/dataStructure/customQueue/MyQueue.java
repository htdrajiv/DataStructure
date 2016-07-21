package com.rajiv.algorithm.practice.dataStructure.customQueue;

import java.util.Arrays;

/**
 * Created by Rajiv on 7/20/2016.
 */
public class MyQueue <T> {
    private T queue[] = (T[]) new Object[2];
    private int count = 0;
//    private int index = 1;

    public void inQueue(T input){
        checkSizeToPush();
        queue[count] = input;
        count++;
    }

    public T peek(){
        checkForPeekPopException();
        return queue[0];
    }

    public T deQueue(){
        T result = peek();
        queue[0] = null;
        count--;
        shiftAfterDequeue();
        checkSizeAfterDequeue();
        return result;
    }

    public void checkSizeToPush(){
        if(count==queue.length){
            queue = Arrays.copyOf(queue, count * 2);
        }
    }

    public void shiftAfterDequeue(){
        if(queue.length>0){
            for(int i=0;i<count;i++){
                queue[i] = queue[i+1];
            }
        }
    }

    public void checkSizeAfterDequeue(){
        if(queue.length>2 && queue.length/2==count){
            queue = Arrays.copyOf(queue,count);
        }
    }

    public void checkForPeekPopException(){
        if(count==0){
            throw new ArrayIndexOutOfBoundsException("No element in the queue to dequeue or peek.");
        }
    }
}
