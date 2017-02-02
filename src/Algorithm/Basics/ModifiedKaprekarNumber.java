package Algorithm.Basics;
import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class ModifiedKaprekarNumber {
    public static void ModifiedKaprekarNumber(){
        Scanner scan = new Scanner (System.in);
        long first = scan.nextLong();
        long last = scan.nextLong();
        boolean noKapre = false;

        for (long num = first; num <= last; num++) {
            //Casting it into Biginteger
            BigInteger sqNum = BigInteger.valueOf(num);

            //Calculating numbers digits
            int NumDig_num = sqNum.toString().length();

            //Calculating square
            sqNum = sqNum.multiply(sqNum);
            String sqStr = sqNum.toString();

            //Calculating sqaures digits
            int NumDig_sq = sqNum.toString().length();
            if (NumDig_num == NumDig_sq){
                if (num == 1){
                    System.out.println(1);
                    noKapre = true;
                }
                else {
                    continue;
                }
            }
            else {
                //Calculating right side
                String right = sqStr.substring(NumDig_sq-NumDig_num,NumDig_sq);
                String left = sqStr.substring(0,NumDig_sq-NumDig_num);
                if (num == Long.valueOf(right) + Long.valueOf(left)){
                    System.out.println(num);
                    noKapre = true;
                }
            }
        }
        if (noKapre == false){
            System.out.println("INVALID RANGE");
        }
    }
}
