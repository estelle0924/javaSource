package com.company.util;

import javax.xml.ws.Action;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:42 2019/1/23
 * @Modified By:
 */
public class ArrayStack<E> implements Stack<E> {

    Array<E> array;

    public ArrayStack(int capacity) {
        array = new Array<E>(capacity);
    }

    public ArrayStack() {
        array = new Array<E>();
    }

    @Override
    public void push(E e) {//添加元素
        array.addLast(e);
    }

    @Override
    public E pop() {//删除元素
        return array.removeLast();
    }

    @Override
    public E peek() {//查看栈顶元素
        return array.getLast();
    }

    @Override
    public int getSize() {//栈大小
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("stack : [");
        for (int i=0;i<array.getSize();i++) {
            builder.append(array.get(i));
            if (i!=array.getSize()-1){
                builder.append(", ");
            }
        }
        builder.append("] top");
        return builder.toString();
    }
}