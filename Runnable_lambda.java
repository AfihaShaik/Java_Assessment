package com.test;
public class Runnable_lambda {

    public static void main(String[] args) {

        // Create a new thread using a lambda expression

        Thread thread = new Thread(() -> {

            System.out.println("Good Morning!");

        });

 

        // Start the thread

        thread.start();

    }

}