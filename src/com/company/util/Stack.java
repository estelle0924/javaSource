package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:40 2019/1/23
 * @Modified By:
 */
public interface Stack<E> {
    void push(E e);//添加元素
    E pop();//删除元素
    E peek();//查看栈顶元素
    int getSize();//获取大小
    boolean isEmpty();//是否为空判断

}