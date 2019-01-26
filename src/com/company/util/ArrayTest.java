package com.company.util;

import java.util.*;
import java.util.LinkedList;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 10:34 2019/1/24
 * @Modified By:
 */
public class ArrayTest {
    public static void main(String[] args) {
        testLoopQueue();
    }

    public static  void  testLoopQueue(){
        LoopQueue<Integer> queue = new LoopQueue<>(5);
        System.out.println(queue);
        for (int i=0;i<7;i++)
            queue.enqueue(i);

        System.out.println(queue);
        System.out.println("\n");
        for (int i=0;i<3;i++){
            queue.dequeue();
            System.out.println(queue);
            System.out.println("\n");
        }

    }


    public static void testQueue(){
        ArrayQueue queue=new ArrayQueue();
        for (int i=0;i<5;i++)
            queue.enqueue(i);//入队 排队 队列

        System.out.println(queue);
        queue.dequeue();//出队 出列
        System.out.println(queue);
    }

    public static void testStack(){
        ArrayStack<Integer> stack =new ArrayStack<>();
        for (int i=0;i<5;i++){
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();//出栈
        System.out.println(stack);
    }

    public static void testArray(){
        Array<Integer> array = new Array<>(20);//泛型中不能存放基本数据类型
        //1.7以后可以忽略new的反泛型 Array<Integer> array = new Array<Integer>(20); 1.7之前写法
        for (int i = 0; i < 10; i++)
            array.addLast(i);
        System.out.println(array);
        array.add(1,50);
        System.out.println(array);
        array.remove(1);
        System.out.println(array);
        array.removeLast();
        System.out.println(array);
        array.addLast(100);
        System.out.println(array);
    }
}