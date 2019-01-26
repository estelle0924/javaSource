package com.company.util;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 10:03 2019/1/25
 * @Modified By:
 */
public class LinkedList<E> {

    private Node dummyHead;//虚拟头节点
    //private Node head;//链表头节点
    private int size;//链表大小

    public LinkedList() {//构造方法
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addHead(E e) {
        /*Node<E> node = new Node(e, head);//新元素
        head = node;*/
        dummyHead.next = new Node(e, dummyHead.next);
        size++;//维护链表长度
    }

    /**
     * 指定位置添加元素
     *
     * @param e
     * @param index
     */
    public void add(E e, int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("指定索引违法");

        Node pro = dummyHead;
        for (int i = 0; i < index; i++)
            pro = pro.next;//找到需要插入位置的上一个节点

        pro.next = new Node(e, pro.next);
        size++;
    }

    /**
     * 链表末尾添加元素 e
     *
     * @param e
     */
    public void addLast(E e) {
        add(e, size);
    }

    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("索引非法");

        Node pro = dummyHead.next;
        for (int i = 0; i < index; i++)
            pro = pro.next;
        return (E) pro.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size);
    }

    public E remove(int index) {//删除一个元素
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("索引非法");

        Node pro = dummyHead;//上个元素
        Node cur = pro.next;
        for (int i = 0; i < index - 1; i++) {
            pro = pro.next;
        }
        pro.next = cur.next;
        cur.next = null;
        size--;
        return (E) pro.e;
    }
    public E removeHead(){
        return remove(0);
    }

    public E removeFront(){
        return remove(size);
    }

    public void removeAll() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    /**
     * 查找是否存在元素
     * @param e
     * @return
     */
    public boolean find(E e){
        Node pro=dummyHead.next;
        while (pro!=null){
            if ((pro.e).equals(e)){
                return true;
            }
            pro=pro.next;
        }
        return false;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("LinkedList: size=%d \t\t",size));
        Node node = dummyHead.next;
        while (node != null) {
            builder.append(node + "-->");
            node=node.next;
        }
        builder.append("NULL");//最后指向的是一个空元素
        return builder.toString();
    }

    /**
     * 私有内部类 节点
     */
    private class Node<E> {
        //变量设计为public LinkedList 可以直接访问 不需要提供getter setter方法
        public E e;//当前节点元素
        public Node<E> next;//下一个节点

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node() {
            this(null, null);
        }

        public Node(E e) {
            this(e, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

}