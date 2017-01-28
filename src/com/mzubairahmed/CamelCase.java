package com.mzubairahmed;

import java.util.Scanner;

/**
 * Created by zub on 27/01/2017.
 */
public class CamelCase {
    public static void hackerrank_CamelCase(){

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int words = 0;
        for (int i = 0 ; i < str.length(); i++){
            if (Integer.valueOf(str.charAt(i)) >= 65 && Integer.valueOf(str.charAt(i)) <= 90 ){
                words++;
            }
            else {
                continue;
            }
        }

        System.out.println(words+1);

    }
}
