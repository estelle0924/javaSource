package com.company.util;


/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 9:46 2019/1/26
 * @Modified By: 链表栈
 */
public class LinkedListStack<E> implements Stack<E> {

    private com.company.util.LinkedList list;//底层是链表

    public LinkedListStack() {
        list = new com.company.util.LinkedList();
    }

    @Override
    public void push(E e) {//添加元素 吧链表的表头作为栈顶
        list.addHead(e);
    }

    @Override
    public E pop() {//出栈 栈先入后出 链表头部进入 尾部删除
        return (E) list.removeHead();
    }

    @Override
    public E peek() {//查看栈顶元素
        return (E) list.getFirst();
    }

    @Override
    public int getSize() {//获取大小
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {//是否为空
        return list.isEmpty();
    }

    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append(String.format("LinkedListStack: size= %d \n",getSize()));
        builder.append("top ");//表头作为栈顶
        for (int i=0;i<getSize();i++){
            builder.append(list.get(i)+"<--");
        }
        //builder.append(list.toString());
        return builder.toString();
    }
}