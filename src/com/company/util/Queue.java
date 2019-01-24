package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 9:48 2019/1/24
 * @Modified By:队列
 */
public interface Queue<E> {
    void enqueue(E e);//入队
    E dequeue();//出队
    E getFrond();//队首元素
    int getSize();//数据大小
    boolean isEmpty();//是否为空
}