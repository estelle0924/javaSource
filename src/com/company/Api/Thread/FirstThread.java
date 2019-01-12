package com.company.Api.Thread;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:29 2019/1/12
 * @Modified By:
 */
public class FirstThread extends Thread {

    /**
     * 执行结果:
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
     */
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}