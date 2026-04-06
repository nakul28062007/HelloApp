package com.example;
/**
 * HelloApp - UC2
 * Author: Nakulvasudev T
 * Version: 2.0
 */

public class HelloApp {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println("Hello " + args[0] + "!");
        } else {
            System.out.println("Hello World!");
        }
    }
}
