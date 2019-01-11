package com.company.Api;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 16:36 2019/1/11
 * @Modified By:
 */
public class StringCodeHash {

    /**
     * 用（==）进行比较的时候，比较的是他们在内存中的存放地址，
     * 所以，除非是同一个new出来的对象，他们的比较后的结果为true，
     * 否则比较后结果为false。
     * 获取内存地址的博客:如下
     * https://blog.csdn.net/ciqingloveless/article/details/81911225
     */
    /**
     * equal()相等的两个对象他们的hashCode()肯定相等
     * hashCode()相等的两个对象他们的equal()不一定相等
     */
    public static void TestStringsStructure(){
        String first=new String();
        first="second";
        String second=new String("second");
        String three="second";
        System.out.println(first==second);//false
        System.out.println(first.equals(second));//true
        System.out.println(first==three);//true
        System.out.println(three==second);//false
        System.out.println(first.hashCode());//-906279820
        System.out.println(second.hashCode());//-906279820
        System.out.println(three.hashCode());//-906279820
        System.out.println(first.hashCode());
    }

    /**
     * String 只要字符串所在的堆空间相同，返回的哈希码也相同
     * 数值型的hashCode是一样的(只测试了int和lang)
     * Integer返回的哈希码就是Integer对象里所包含的那个整数的数值
     * Object的hashCode() 是经过处理解析的
     * 推荐一篇博客
     * https://www.cnblogs.com/keyi/p/7119825.html
     */
    public static void TestHashCode(){
        String sFirst="first";
        String sSecond="first";
        String sThree=new String("first");
        Object first=1;
        Object second=1;
        Object three=new Object();
        three=1;
        System.out.println(sFirst.hashCode());//97440432
        System.out.println(sSecond.hashCode());//97440432
        System.out.println(sThree.hashCode());//97440432
        System.out.println(first.hashCode());//1
        System.out.println(second.hashCode());//1
        System.out.println(three.hashCode());//1
    }
    public static void main(String[] args) {
        TestStringsStructure();
        System.out.println("==================================");
        TestHashCode();
    }

}