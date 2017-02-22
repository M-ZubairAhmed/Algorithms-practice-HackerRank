package Challenges;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by zub on 22/02/2017.
 */
public class BigSorting {
    public static void test(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        ArrayList<BigInteger> justlist = new ArrayList<>();
        for(int j=0; j < n; j++){
            unsorted[j] = in.next();
            justlist.add(new BigInteger(unsorted[j]));
        }

        Collections.sort(justlist);

        for(int i=0;i<n;i++){
            System.out.println(justlist.get(i));
        }
    }
}
