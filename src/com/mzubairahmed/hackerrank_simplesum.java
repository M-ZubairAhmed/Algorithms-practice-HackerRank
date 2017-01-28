package com.mzubairahmed;

import java.util.Scanner;

public class hackerrank_simplesum {
    public static void hackerrank_simplesum(){

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String nArray = scan.nextLine();
        scan.close();

        String[] numbers = new String[n];

        int ini = 0;
        int arrayCur = 0;

        for (int i = 0 ; i < nArray.length(); i++){
            if (nArray.charAt(i) == ' '){
                numbers[arrayCur] = nArray.substring(ini,i);
                arrayCur++;
                ini = i+1;
            }
            if (i == nArray.length() - 1){
                numbers[arrayCur] = nArray.substring(ini,nArray.length());
            }
        }
        int sum = 0;
        for (int j=0; j < numbers.length;j++){
//            System.out.println(numbers[j]);
            sum = sum + Integer.valueOf(numbers[j]);
        }
        System.out.println(sum);
    }
    
}
