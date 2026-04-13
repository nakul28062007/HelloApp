package com.example;
/**
 * HelloApp - UC3: A simple Java application that prints a greeting message to the console.
 * Author: Nakulvasudev T
 * Version: 3.0
 */

public class HelloApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<args.length; i++){
            sb.append(args[i]);
            if(i<args.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}

