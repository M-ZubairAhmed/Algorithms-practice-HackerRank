package Algorithm.Basics;

import java.util.Scanner;

/**
 * Created by zub on 28/01/2017.
 */
public class BeautifulDays {
    public static void BeautifulDays(){

        Scanner scan = new Scanner(System.in);
        int startday = scan.nextInt();
        int endday = scan.nextInt();
        int divisor = scan.nextInt();
        int[] days = new int[endday - startday + 1];
        for (int z = 0; z < endday - startday + 1; z++){
            days[z] = startday + z;
        }
        int beautifulDays = 0;
        for (int z = 0; z < endday - startday + 1; z++){
            StringBuilder st = new StringBuilder(String.valueOf(days[z]));
            int diff = Math.abs(days[z] - Integer.valueOf(st.reverse().toString()));
            if (diff % divisor == 0){
                beautifulDays++;
            }
        }
        System.out.println(beautifulDays);

    }
}
