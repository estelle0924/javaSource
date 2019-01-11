package com.company.Api;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 17:15 2019/1/11
 * @Modified By:
 */
public class StringCode {
    public static void TestString(){
        String first=new String("first");
        //比较  正则表达式比较
        System.out.println(first.matches(".*first.*"));//true
        //比较 equals比较内容 只比较是否一样
        System.out.println(first.equals(".*first.*"));//false
        //==  比较  比较内存地址和内容
        System.out.println(first=="first");//false
        System.out.println(first.hashCode());//97440432
        //charAt 位于字符串的指定索引处的字符
        System.out.println(first.charAt(1));//i
        //往方法codePointAt(int index)传入字符的index，返回字符串中对应字符的代码点
        System.out.println(first.codePointAt(1));//105
        //This method returns the Unicode code point value before the given index.
        //给定index之前的Unicode
        System.out.println(first.codePointBefore(1));//102
        //compareTo()的返回值是整型,它是先比较对应字符的大小(ASCII码顺序),如果第一个字符和参数的第一个字符不等,结束比较,返回他们之间的
        System.out.println(first.compareTo("f"));//4
        System.out.println(first.compareTo("F"));//32
        //忽略大小写比较
        System.out.println(first.compareToIgnoreCase("f"));//4
        System.out.println(first.compareToIgnoreCase("F"));//4
        //合并
        System.out.println(first.concat("f"));//firstf
        //包含
        System.out.println(first.contains("f"));//true
        //内容相等
        System.out.println(first.contentEquals("first"));//false
        System.out.println("'''''''''''''''''''''''''");
        System.out.println(first.getBytes());//[B@782830e
    }

    /**
     * compareTo()的返回值是整型,
     * 如果字符串相等返回值0
     * 它是先比较对应字符的大小(ASCII码顺序),
     * 如果第一个字符和参数的第一个字符不等,结束比较,返回他们之间的差值,
     * 如果第一个字符和参数的第一个字符相等,则以第二个字符和参数的第二个字符做比较,
     * 以此类推,直至比较的字符或被比较的字符有一方
     */
    public static void testCompareTo(){
        String s1 = "abc";
        String s2 = "abcd";
        String s3 = "abcdfg";
        String s4 = "1bcdfg";
        String s5 = "cdfg";
        String s6="abc";
        System.out.println( s1.compareTo(s2) ); // -1 (前面相等,s1长度小1)
        System.out.println( s1.compareTo(s3) ); // -3 (前面相等,s1长度小3)
        System.out.println( s1.compareTo(s4) ); // 48 ("a"的ASCII码是97,"1"的的ASCII码是49,所以返回48)
        System.out.println( s1.compareTo(s5) ); // -2 ("a"的ASCII码是97,"c"的ASCII码是99,所以返回-2)
        System.out.println(s1.compareTo(s6));//0 如果相等 返回值为0
    }
    public static void main(String[] args) {
        TestString();
        System.out.println("==================================");
        testCompareTo();
    }
}