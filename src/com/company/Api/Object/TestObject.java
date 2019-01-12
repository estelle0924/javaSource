package com.company.Api.Object;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 15:57 2019/1/12
 * @Modified By:
 */
public class TestObject {
    public static void main(String[] args) {
        Object o=new Object();
        System.out.println(o.equals("x"));//比较 false
        System.out.println(o.hashCode());//hash值 1982791261
        //getClass().getName() + "@" + Integer.toHexString(hashCode());
        //十六进制字符串
        //toUnsignedString0(i, 4);todo

        System.out.println(o.toString());//java.lang.Object@762efe5d
        o.notify();//java.lang.IllegalMonitorStateException
                        //at java.lang.Object.notify(Native Method)
    }



}