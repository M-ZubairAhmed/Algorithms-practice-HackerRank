package com.mzubairahmed;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSumPairs {

    public static void DivisibleSumPairs(){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
//        for (int j = 0; j < n; j++ ){
//            System.out.println(a[j]);
//        }
        Arrays.sort(a);
        int count = 0;
        for (int p = 0; p < n; p++){
            for (int q = p + 1; q < n; q++){
                if (((a[p] + a[q]) % k) == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
