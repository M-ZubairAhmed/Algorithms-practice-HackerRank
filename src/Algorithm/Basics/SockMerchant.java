package Algorithm.Basics;

import java.util.Scanner;

public class SockMerchant {
    public static void SockMerchant(){
        Scanner in = new Scanner(System.in);
        int totalUnfilteredSocks = in.nextInt();
        int unfilteredSocksAr[] = new int[totalUnfilteredSocks];
        for(int c_i=0; c_i < totalUnfilteredSocks; c_i++){
            unfilteredSocksAr[c_i] = in.nextInt();
        }
        int matchedSocksPair = 0;
        for (int p = 0; p < totalUnfilteredSocks; p++){
            for (int q = p + 1; q < totalUnfilteredSocks; q++){
                if (unfilteredSocksAr[p] == unfilteredSocksAr[q] && unfilteredSocksAr[p] != 0 && unfilteredSocksAr[q] != 0){
                    matchedSocksPair++;
                    unfilteredSocksAr[p] = 0;
                    unfilteredSocksAr[q] = 0;
                    break;
                }
            }
        }
        System.out.println(matchedSocksPair);
    }
}
