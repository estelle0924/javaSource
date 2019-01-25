package com.company.util;


/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 12:39 2019/1/25
 * @Modified By:
 */
public class ListTest {

    public static void main(String[] args) {
        testLinkedList();
    }

    public static  void  testLinkedList(){
        LinkedList linkedList=new LinkedList();
        System.out.println(linkedList);
        linkedList.addHead("s");
        linkedList.addLast("e");
        System.out.println(linkedList);
        linkedList.add("b",1);
        System.out.println(linkedList);
        System.out.println(linkedList.find("b"));
        System.out.println(linkedList.find("1"));
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}