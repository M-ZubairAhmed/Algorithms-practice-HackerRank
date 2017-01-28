package com.Algorithm.Basics;

import java.util.Scanner;

public class FindDigits {
    public static void FindDigits(){

        Scanner scan = new Scanner(System.in);
        int trials = scan.nextInt();

        for (int z = 1; z <= trials; z++){
            int number = scan.nextInt();
            String numberStr = String.valueOf(number);
            int count = 0;

            for (int i = 0; i < numberStr.length(); i++){
                int digits = (numberStr.charAt(i)) - 48;
                if (digits == 0){
                    continue;
                }
                else {
                    if ((number % digits == 0)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
