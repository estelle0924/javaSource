package com.company.enums;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 14:47 2019/1/26
 * @Modified By:1.5之后新增关键字 enum实现枚举
 * 若枚举只有一个成员着可以作为一种单例模式的实现方式
 */
public enum Season implements Info{//季节枚举类
    SPRING("SPRING", "春暖花开"){
        public void show(){
            System.out.println(SPRING.getModefied());
        }
    },
    SUMMER("summer", "烈日炎炎"){
        public void show(){
            System.out.println(SUMMER.getModefied());
        }
    },
    FALL("FALL", "秋高气爽"){
        public void show(){
            System.out.println(FALL.getModefied());
        }
    },
    WINTER("WINTER", "白雪皑皑"){
        public void show(){
            System.out.println(WINTER.getModefied());
        }
    };

    private final String seasonName;//季节
    private final String modefied;//描述

    private Season(String seasonName, String modefied) {
        this.seasonName = seasonName;
        this.modefied = modefied;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getModefied() {
        return modefied;
    }
}

interface Info{
    void show();//展示
}