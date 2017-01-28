package Algorithm.Basics;

import java.util.Scanner;

public class MaximumDraw {

    public static void MaximumDraw(){

        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] sol = new int[count];

        for (int i = 0; i < count; i++){
            sol[i] = scan.nextInt();
        }
        for (int j = 0 ; j < sol.length; j++){
            System.out.println(sol[j - 1]);
        }

    }
}
