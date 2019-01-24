package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:01 2019/1/24
 * @Modified By:
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] arr;
    private int front;//队首的索引
    private int tail;//队尾的索引
    private int size;//数组大小

    public LoopQueue() {
        this(10);
    }

    public LoopQueue(int capacity) {
        arr = (E[]) new Object[capacity + 1];//循环队列有意浪费一个空间
        front = 0;
        tail = 0;
        size = 0;
    }

    public int getCapacity() {
        return (arr.length - 1);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("LoopQueue : size : %d , Capacity = %d \n", size, getCapacity()));
        //todo foreach
        builder.append(String.format("front:  %d , tail: %d ,\n front [ ", front, tail));
        for (int i = front; i != tail; i = (i + 1) % arr.length) {
            builder.append(arr[i]);
            if ((i + 1) % arr.length != tail)
                builder.append(", ");
        }
        builder.append("] tail");
        return builder.toString();
    }

    @Override
    public void enqueue(E e) {//入队
        //判断队列是否满了
        if ((tail + 1) % arr.length == front) {
            resize(getCapacity() * 2); //队列已经满了 需要扩容
        }
        arr[tail] = e;
        tail = (tail + 1) % arr.length;
        size++;//元素个数++
    }

    /**
     * 扩容
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] array = (E[]) new Object[newCapacity + 1];//指向一个新的数组
        for (int i = 0; i < size; i++) {
            array[i] = arr[(i + front) % getCapacity()];
        }
        arr = array;
        front = 0;
        tail = size;
    }

    @Override
    public E dequeue() {//出队
        //判断队列是否为空
        if (isEmpty())
            throw new IllegalArgumentException("循环队列为空");

        E e = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;

        //删除一个元素 是否需要缩容
        if (size <= (getCapacity() / 2) && getCapacity() / 2 != 0)
            resize(getCapacity() / 2);

        return e;
    }

    @Override
    public E getFrond() {//队首
        return arr[front];
    }

    public E getTail() {
        return arr[tail];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;//有意空了一个元素 所以两者指向一致的话 队列为空
    }
}