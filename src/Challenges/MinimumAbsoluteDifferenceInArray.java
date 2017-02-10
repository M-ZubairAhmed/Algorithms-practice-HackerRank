package Challenges;
import java.util.Arrays;
import java.util.Scanner;
public class MinimumAbsoluteDifferenceInArray {
    public static void MinimumAbsoluteDifferenceInArray(){
        Scanner scan = new Scanner(System.in);
        int nos = scan.nextInt();
        int[] ar = new int[nos];
        for (int z = 0; z < nos; z++) {
            ar[z] = scan.nextInt();
        }
/*
        int min = Math.abs(ar[0] - ar[1]);
        for (int i = 0; i < nos; i++) {
            for (int j = i + 1; j < nos; j++) {
                int diff = Math.abs(ar[i] - ar[j]);
                if (diff < min){
                    min = diff;
                }
            }
        }
        System.out.println(min);*/

        for (int i = 0; i < nos; i++) {
            if (ar[i] < 0){
                ar[i] = Math.abs(ar[i]);
            }
        }
        Arrays.sort(ar);
        System.out.println(ar[1] - ar[0]);
    }
}
