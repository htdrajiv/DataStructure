package com.rajiv.algorithm.practice.dataStructure.customSinglyLinkList;

/**
 * Created by Rajiv on 7/22/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        MySingleLinkList<String> mySingleLinkList = new MySingleLinkList<>();
        mySingleLinkList.add("first node");
        mySingleLinkList.add("second node");
        mySingleLinkList.add("third node");
        mySingleLinkList.add("forth node");
        mySingleLinkList.remove(3);
        mySingleLinkList.remove(2);
//        mySingleLinkList.remove(1);
//        mySingleLinkList.remove(0);
        System.out.println(mySingleLinkList.toString());

        System.out.println(" >>> "+mySingleLinkList.get(0));
        System.out.println(" >>> "+mySingleLinkList.get(1));
        System.out.println(" >>> "+mySingleLinkList.get(2));
        System.out.println(" >>> "+mySingleLinkList.get(3));
        System.out.println(" >>> "+mySingleLinkList.get(4));
        System.out.println(" >>> "+mySingleLinkList.get(5));
    }
}
