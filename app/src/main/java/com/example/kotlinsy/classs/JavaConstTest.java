package com.example.kotlinsy.classs;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * create by zhangshi on 2020/4/14.
 */
public class JavaConstTest {
    public static void main(String[] args) {
        System.out.println(ConstFileKt.TYPE_ONE);
        System.out.println(ConstFileKt.TYPE_TOW);
        System.out.println(A.B_TYPE_ONE);

        // TODO: 2020/4/14 java数组支持协变
        String[] strs = new String[]{"1", "2", "3"};
        Object[] objs = strs;

        // TODO: 2020/4/14 java集合不支持协变
        List<String> items = new ArrayList<>();
//        List<Object> objItemS = items;

        Set<String> strSet = new HashSet<>();
        strSet.add("1");
        strSet.add("2");
        strSet.add("3");
        for (String item : strSet) {
            System.out.println(item);
        }


    }
}
