package com.leoita.FP04_advanced_streams;

import java.util.stream.IntStream;

public class AS15_Threads {
    public static void main(String[] args) {

        //structured programming
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println(Thread.currentThread().getId() + ":" + i);
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
//        Thread thread1 = new Thread(runnable);
//        thread1.start();
//        Thread thread2 = new Thread(runnable);
//        thread2.start();

        //functional programming

//        Runnable runnable2  = () -> {
//            for (int i = 0; i < 100; i++) {
//                System.out.println(Thread.currentThread().getId() + ":" + i);
//            }
//        };
//
//        Thread thread3 = new Thread(runnable2);
//        thread3.start();
//        Thread thread4 = new Thread(runnable2);
//        thread4.start();
//        Thread thread5 = new Thread(runnable2);
//        thread5.start();

        //functional programming plus

        Runnable runnable3  = () ->
            IntStream.range(0,100)
                    .forEach( i-> System.out.println(Thread.currentThread().getId() + ":" + i));

        Thread thread6 = new Thread(runnable3);
        thread6.start();
        Thread thread7 = new Thread(runnable3);
        thread7.start();
        Thread thread8 = new Thread(runnable3);
        thread8.start();
    }
}
