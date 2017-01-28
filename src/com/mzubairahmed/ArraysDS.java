package com.mzubairahmed;

import java.util.Scanner;

public class ArraysDS {
    public static void ArraysDS(){

        Scanner scan = new Scanner(System.in);
        int sizeAr = scan.nextInt();
        scan.nextLine();
        String nArray = scan.nextLine();
        scan.close();

        int[]arr = new int[sizeAr];
        int ini = 0;
        int cur = 0;
        for (int i = 0; i < nArray.length(); i++) {
            if (nArray.charAt(i) == ' ') {
                arr[cur] = Integer.valueOf(nArray.substring(ini, i));
                cur++;
                ini = i + 1;
            }
            if (i == nArray.length() - 1) {
                arr[cur] = Integer.valueOf(nArray.substring(ini, nArray.length()));
            }
        }

        for (int j = 0; j < arr.length; j++){
//
//            if(j == arr.length - 1){
//                System.out.print(arr[j - 1]);
//            }
//            else {
                System.out.print(arr[arr.length - j -1] + " ");
//            }
        }

    }

}
