package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 9:53 2019/1/24
 * @Modified By:
 */
public class ArrayQueue<E> implements Queue<E> {
    Array<E> array;

    public ArrayQueue(int capacity){
        array=new Array<E>(capacity);
    }

    public ArrayQueue(){
        array=new Array<E>();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFrond() {
        return array.getFirst();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Queue : top [");
        for (int i=0;i<array.getSize();i++){
            builder.append(array.get(i));
            if (i!=array.getSize()-1){
                builder.append(" ,");
            }
        }
        builder.append("] ");
        return builder.toString();
    }
}