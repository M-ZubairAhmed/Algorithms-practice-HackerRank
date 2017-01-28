package com.mzubairahmed;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    public static void MinMaxSum(){

        Scanner scan = new Scanner(System.in);
        String nArray = scan.nextLine();
        scan.close();

        long[] numSeq = new long[5];

        int ini = 0;
        int arrayCur = 0;
        for (int i = 0; i < nArray.length(); i++) {
            if (nArray.charAt(i) == ' ') {
                numSeq[arrayCur] = Long.valueOf(nArray.substring(ini, i));
                arrayCur++;
                ini = i + 1;
            }
            if (i == nArray.length() - 1) {
                numSeq[arrayCur] = Long.valueOf(nArray.substring(ini, nArray.length()));
            }
        }
        Arrays.sort(numSeq);
        long bigSum = numSeq[1] + numSeq[2] + numSeq[3] + numSeq[4];
        long smallSum = numSeq[0] + numSeq[1] + numSeq[2] + numSeq[3];
//        for (int j = 0; j < 5; j++){
//            if (j == 0 && j <= 3) {
//                smallSum = smallSum + numSeq[j];
//            }
//            else if(j == 1 && j <= 4){
//                bigSum = bigSum + numSeq[j];
//            }
//        }
        System.out.println(smallSum + " " + bigSum);
    }
}
