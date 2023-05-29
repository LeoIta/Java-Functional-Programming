package com.leoita.FP04_advanced_streams;

import java.util.stream.LongStream;

public class AS12_parallel_stream {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        System.out.println(LongStream.range(0,1234567890).sum()); //762078936892242105
        System.out.println(System.currentTimeMillis() - time); //3339
        long startTime = System.currentTimeMillis();
        System.out.println(LongStream.range(0,1234567890).parallel().sum()); //762078936892242105
        System.out.println(System.currentTimeMillis() - startTime); //297
      /*
      using parallel() you improve a lot the performance.
      the execution time decrease from more than 3s to less than 0.3sec
      */
    }
}
