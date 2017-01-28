package Algorithm.Basics;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

    public static void hackerrank_ExtraLongFactorials(){

        Scanner scan = new Scanner(System.in);
        int recNo = scan.nextInt();

        BigInteger num = BigInteger.ONE;

        for (int i = 1 ; i <= recNo; i++){
            num = num.multiply(num.valueOf(i));
        }
        System.out.println(num);



    }
}
