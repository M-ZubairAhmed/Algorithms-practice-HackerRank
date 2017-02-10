package Algorithm.Implementation;

import java.util.Scanner;

public class UtopianTree {

    public static void UtopianTree(){

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int[] cycles = new int[testCases];
        for (int i = 0 ; i < testCases; i ++){
            cycles[i] = scan.nextInt();
        }
        scan.close();
        for (int j = 0; j < testCases; j++){
            int growth = 0;
            int n = cycles[j];
            if (n <= 0){
                System.out.println(1);
                continue;
            }
            for (int k = 0; k <= n; k++){
                if (k % 2 == 0){
                    growth = growth + 1;
                }
                else {
                    growth = growth * 2;
                }
            }
            System.out.println(growth);
        }
    }
}
