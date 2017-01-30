package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by zub on 30/01/2017.
 */
public class Panagram {
    public static void Panagram() {
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        inputStr = inputStr.toLowerCase();
        inputStr = inputStr.replaceAll("\\s", "");

        int[] alphaFreq = new int[26];
        for (int i = 0; i < inputStr.length(); i++) {
            int posAlpha = inputStr.charAt(i) - 97;
            alphaFreq[posAlpha] = alphaFreq[posAlpha] + 1;
        }
        boolean missingAlpha = false;
        for (int x = 0; x < 26; x++) {
            if (alphaFreq[x] == 0) {
                missingAlpha = true;
                break;
            }
        }
        if (missingAlpha) {
            System.out.println("Not a pan");
        } else {
            System.out.println("Pan");
        }
    }

}

