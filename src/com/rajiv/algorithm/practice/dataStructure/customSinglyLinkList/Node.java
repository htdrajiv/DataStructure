package com.rajiv.algorithm.practice.dataStructure.customSinglyLinkList;

/**
 * Created by Rajiv on 7/21/2016.
 */
public class Node <V> {
    private V data;
    public Node next;

    public Node(V data,Node next){
        this.data = data;
        this.next = next;
    }

    public void setData(V data){
        this.data = data;
    }
    public V getData(){
        return this.data;
    }

    @Override
    public String toString(){
        return this.data!=null?this.data.toString():"";
    }
}
