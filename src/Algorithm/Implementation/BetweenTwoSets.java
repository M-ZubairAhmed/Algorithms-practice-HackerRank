package Algorithm.Implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zub on 28/01/2017.
 */
public class BetweenTwoSets {
    public static void BetweenTwoSets(){

        Scanner scan = new Scanner(System.in);
        int sizeA = scan.nextInt();
        int sizeB = scan.nextInt();
        int[] A = new int[sizeA];
        int[] B = new int[sizeB];
        for (int y = 0 ; y < sizeA; y++){
            A[y] = scan.nextInt();}
        Arrays.sort(A);
        for (int z = 0 ; z < sizeB; z++){
            B[z] = scan.nextInt();}
        Arrays.sort(B);
        scan.close();

        int count = 0;
        for (int i = A[A.length - 1] ; i <= B[0]; i++){
            boolean aDivides = true;
            for (int p = 0; p < A.length; p++){
                if (i % A[p] == 0){
                    aDivides = true;
                    continue;
                }
                else {
                    aDivides = false;
                    break;
                }
            }
            boolean bDivides = true;
            for (int q = 0; q < B.length; q++){
                if (B[q] % i == 0){
                    bDivides = true;
                }
                else {
                    bDivides = false;
                    break;
                }
            }
            if (aDivides && bDivides){
                count++;
            }
        }
        System.out.println(count);
    }
}
