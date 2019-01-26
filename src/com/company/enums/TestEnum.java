package com.company.enums;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 15:08 2019/1/26
 * @Modified By:
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.FALL);
        System.out.println(Season.WINTER);
        Season.values();
        Season.SPRING.show();
        System.out.println();
        System.out.println(Season.FALL.getSeasonName());
        System.out.println(Season.FALL.getModefied());
    }
}