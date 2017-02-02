package Algorithm.Strings;

import java.util.Scanner;

public class Gemstones {
    public static void Gemstones(){

        Scanner scan = new Scanner(System.in);
        int nosRocks = scan.nextInt();
        String[] rock = new String[nosRocks];
        for (int z = 0; z < nosRocks; z++){
            rock[z] = scan.next();
        }
        scan.close();

        int[] alphaFreq = new int[26];

        for (int i = 0; i < nosRocks; i++){
            for (int p = 0; p < rock[i].length(); p++){
                int posAlpha = rock[i].charAt(p) - 97;
                if (alphaFreq[posAlpha] == i){
                    alphaFreq[posAlpha]++;
                }
            }
        }
        int gemElements = 0;
        for (int j = 0; j < 26; j++){
            if (alphaFreq[j] == nosRocks - 1){
                gemElements++;
            }
        }
        System.out.println(gemElements);
    }
}
