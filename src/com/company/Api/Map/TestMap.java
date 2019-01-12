package com.company.Api.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 16:51 2019/1/12
 * @Modified By:
 */
public class TestMap {
    public static void testHashMap(){
        Map<String,String> map=new HashMap<String,String>();
        System.out.println(map.toString());//{}
        System.out.println(map.hashCode());//0
        map.put("first","first");//赋值
        System.out.println(map);//{first=first}
        System.out.println(map.get("first"));//取值 first
        map.put("first","second");
        System.out.println(map);//testHashMap
        System.out.println(map.get("first"));//取值 second
        map.clear();//清除
        System.out.println(map);//{}
    }

    public static void testHashTable(){
        Map map=new Hashtable();
        map.put(null,null);
        map.put("",null);
        System.out.println(map.toString());//{}
        System.out.println(map.hashCode());//0
        map.put("first","first");//赋值
        System.out.println(map);//{first=first}
        System.out.println(map.get("first"));//取值 first
        map.put("first","second");
        System.out.println(map);//testHashMap
        System.out.println(map.get("first"));//取值 second
        map.clear();//清除
        System.out.println(map);//{}
    }

    public static void test(){
        HashMap hashMap=new HashMap();
        hashMap.put("first","first");
        hashMap.put("first","second");
        System.out.println(hashMap);
        Hashtable hashtable=new Hashtable();
        hashtable.put("first","first");
        hashtable.put("first","second");
        System.out.println(hashtable);
    }

    public static void main(String[] args) {
        test();
    }
}