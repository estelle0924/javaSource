package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 22:06 2019/1/22
 * @Modified By:
 */
public class Array<E> {
    private E[] data;
    private int size;//数组有效元素的个数 同时指向第一个没有元素的位置
    //容量 data数组的length

    /**
     * 构造函数 传入数组容量构造Array
     *
     * @param capacity 用户希望开辟的容量空间
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数  默认含量为10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 获取数组容量
     *
     * @return
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * 判断数组是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 数组末尾添加元素
     *
     * @param arr
     */
    public void addLast(E arr) {
        if (size == data.length)//数组的大小等于可以容纳的空间数
            throw new IllegalArgumentException("数组空间已满");
        data[size] = arr;
        size++;//保证指向数组中下一个没有元素的位置
        //data[size++] = arr;
    }

    /**
     * 在指定索引处插入元素
     *
     * @param index 指定位置的索引
     * @param arr   需要插入的元素
     */
    public void add(int index, E arr) {
        //保证index合法 1.索引大于0 2.index大于size元素不是紧密排列的,会存在一些位置没有合法元素
        if (index < 0 || index > size)
            throw new IllegalArgumentException("index参数不合法");

        //数组扩容
        if (size == data.length)//todo 需要新增方法
            resize(2 * data.length);//2倍扩容

        for (int i = size - 1; i >= index; i--)//从后向前遍历
            data[i + 1] = data[i];//元素后移

        data[index] = arr;
        size++;
    }

    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }


    /**
     * 获取指定索引的元素
     *
     * @param index
     * @return
     */
    E get(int index) {
        if (index<0 || index >size )
            throw new IllegalArgumentException("索引不合法");
        return data[index];
    }

    E getFirst(){
        return get(0);
    }
    E getLast(){
        return get(size);
    }

    /**
     * 是否存在某个元素
     *
     * @param o
     * @return
     */
    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o))
                return true;
        }
        return false;
    }

    /**
     * 返回指定元素的索引(返回指定元素第一次出现的索引,数组可以重复)
     * 如果不存在 返回-1 数组索引从0开始
     *
     * @param o
     * @return
     */
    public int find(E o) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o))
                return i;
        }
        return -1;
    }

    /**
     * 删除指定索引的元素
     *
     * @param index
     * @return 删除的元素
     */
    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("索引不合法");
        E e=data[index];
        for (int i = index; i < size; i++) {
            data[i] = data[i + 1];
        }
        size--;
        data[size] = null;//释放资源 可以被垃圾回收机制回收 也可以不释放等到下次添加元素的时候再被回收
        // todo loitering objects != memory leak
        //进行容器缩容
        if (size<=data.length/2)
            resize(data.length/2);
        return e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size);
    }



    /**
     * 删除指定元素(删除第一次出现的指定元素)
     *
     * @param arr
     */
    public void removeElement(E arr) {
        int index = find(arr);
        if (index > 0)
            remove(index);
    }


    public void removeAllElement() {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Array : size = %d , capacity = %d \n", size, data.length));
        builder.append("[ ");
        for (int i = 0; i < size; i++) {//size和capacity capacity容量可能存在没有合法元素的情况
            builder.append(data[i]);
            if (i != size - 1)
                builder.append(", ");
        }
        builder.append(" ]");
        return builder.toString();
    }

}