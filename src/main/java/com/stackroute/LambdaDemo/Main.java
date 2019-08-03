package com.stackroute.LambdaDemo;

public class Main {
    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
        System.out.println("normal method");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous");
            }
        });

//        new Thread(()->{
//            System.out.println("Lambda");
//            System.out.println("Another Lambda");
//
//        }
//        ).start();
    }

    }
