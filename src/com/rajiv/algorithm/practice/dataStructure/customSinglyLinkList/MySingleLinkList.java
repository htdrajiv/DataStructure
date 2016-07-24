package com.rajiv.algorithm.practice.dataStructure.customSinglyLinkList;

/**
 * Created by Rajiv on 7/21/2016.
 */
public class MySingleLinkList <V> {

    private Node header;
    private Integer counter = 0;

    public MySingleLinkList(){
        this.header = new Node<String>(null,null);
    }

    public boolean isEmpty(){
        return (this.header.next==null);
    }

    private void insertFirstNode(V data) throws Exception {
        this.header = new Node<V>(data,null);
    }

    public void add(V data) throws Exception {
        if (isEmpty()) {
            insertFirstNode(data);
        }
        Node temp = new Node(data,null);
        Node current = header;
        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = temp;
        }
        counter++;
    }

    public void add( int index,V data) {
        Node temp = new Node(data,null);
        Node current = header;
        if (current != null) {
            for (int i = 0; i < index && current.next != null; i++) {
                current = current.next;
            }
        }
        temp.next = current.next;
        current.next = temp;
        counter++;
    }

    public V get(int index)
    {
        if (index < 0)
            return null;
        Node current = null;
        if (!isEmpty()) {
            current = header.next;
            for (int i = 0; i < index; i++) {
                if (current.next == null)
                    return null;

                current = current.next;
            }
            return (V) current.getData();
        }
        return null;
    }

    public boolean remove(int index) {
        if (index < 0 || index > counter)
            return false;
        Node current = header;
        if (!isEmpty()) {
            for (int i = 0; i < index; i++) {
                if (current.next == null)
                    return false;
                current = current.next;
            }
            current.next = current.next.next;
            counter--;
            return true;

        }
        return false;
    }

    @Override
    public String toString(){
        String result = "";
        if(isEmpty()){return "[]";}
        Node<V> node = header.next;
        result += "[";
        result += node.toString();
//        node = node.next;
        while(node.next!=null){
            node = node.next;
            result += ","+node.toString();
        }
        result += "]";
        return result;
    }

}
