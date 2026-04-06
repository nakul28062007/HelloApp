package com.example;
/**
 * HelloApp - UC3: A simple Java application that prints a greeting message to the console.
 * Author: Nakulvasudev T
 * Version: 3.0
 */

public class HelloApp {
    public static void main(String[] args) {
        String name = "World";
        if(args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, " + name + "!");
        }
    }

