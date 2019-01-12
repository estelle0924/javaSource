package com.company.Api.Thread;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:29 2019/1/12
 * @Modified By:
 * https://www.cnblogs.com/lwbqqyumidi/p/3804883.html
 */
public class ThreadTest {

    /**
     * =================================
     Thread-0 0
     Thread-0 1
     Thread-0 2
     Thread-0 3
     Thread-0 4
     Thread-0 5
     Thread-0 6
     Thread-0 7
     Thread-0 8
     Thread-0 9
     Thread-1 0
     Thread-1 1
     Thread-1 2
     Thread-1 3
     Thread-1 4
     Thread-1 5
     Thread-1 6
     Thread-1 7
     Thread-1 8
     Thread-1 9
     * @param args
     */
    public static void main(String[] args){
        //new 创建一个新线程 进入新建状态
        Thread first=new FirstThread();
        //调用 start() 线程进入就绪状态
        first.start();//-----------FirstThread线程运行-----------
        System.out.println("=================================");
        Runnable second=new FirstRunnable();//创建一个Runnable实现类的对象
        Thread thread=new Thread(second);//将second作为Thread target创建新的线程
        thread.start();//调用start()方法使得线程进入就绪状态
    }
}