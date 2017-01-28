package Algorithm.Basics;

import java.util.Scanner;

public class Staircase {
    public static void hackerrank_staircase(){

        Scanner scan  = new Scanner(System.in);
        int heightPyramid = scan.nextInt();
        scan.close();
        int whitespaces ;
        int hashtags;
        for (int i = 1; i <= heightPyramid; i++){
            whitespaces = heightPyramid - i;
            while (whitespaces>0){
                System.out.print(" ");
                whitespaces--;
            }
            hashtags = i;
            while (hashtags > 0){
                System.out.print("#");
                hashtags--;
            }
            System.out.println("");
        }
    }

}
