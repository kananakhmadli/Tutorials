package com.akh.springbootsecurity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Test> test = new HashSet<>(Arrays.asList(new Test(), new Test()));
        System.out.println(test);


    }
}
