package com.company.util;

import java.util.Stack;

/**
 * @Author: estelle
 * @Description:
 * @Date: Created in 16:09 2019/1/23
 * @Modified By:
 */
public class Solution {
    /**
     * 传入一个字符串,判断参数(括号)是否合法关闭
     * https://leetcode-cn.com/problems/valid-parentheses/
     * @param s
     * @return
     */
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            char element=s.charAt(i);//转换为char类型
            if (element=='(' || element == '{' || element == '[')//左侧元素的话入栈
                stack.push(element);
            else{//比较
                if (stack.isEmpty())//没有元素  是个空栈
                    return false;
                char topChar=stack.pop();//栈顶元素 出栈
                if (topChar=='{' && element != '}')
                    return false;
                if (topChar == '[' && element !=']')
                    return false;
                if (topChar == '(' && element !=')')
                    return false;
            }
        }
        //最后需要栈为空
        return stack.isEmpty();
    }

    public String largestNumber(int[] nums) {
        StringBuilder result=new StringBuilder();

        return null;
    }
}