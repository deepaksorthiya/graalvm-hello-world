package com.example;

import java.util.Map;

/**
 * @author Deepak
 */
public class MainApp {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Hello World!");
        System.out.println(i);

        Calculator calculator = new Calculator();

        int sum = calculator.sum(1, 2);
        int sub = calculator.sub(1, 2);

        System.out.println(sum);
        System.out.println(sub);

        Map<Integer, String> map = calculator.getMap();
        System.out.println(map);

    }
}
