package com.example;
/**
 * Author: Nakulvasudev T
 * Version: 7.0
 */

public class HelloApp {
    public static void main(String[] args){
        String names = "World";
        if(args.length>0){
            names = String.join(",",args);
        }
        System.out.println("Hello "+names);
    }
}


