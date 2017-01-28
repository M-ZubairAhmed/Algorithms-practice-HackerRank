package Algorithm.Basics;

import java.util.Scanner;

public class SockMerchant {
    public static void SockMerchant(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        for (int p = 0; p < n; p++){
            for (int q = p + 1; q < n; q++){
                if (c[p] == c[q] && c[p] != 0 && c[q] != 0){
                    count++;
                    c[p] = 0;
                    c[q] = 0;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
