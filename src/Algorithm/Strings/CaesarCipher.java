package Algorithm.Strings;

import java.util.Scanner;

import static java.awt.SystemColor.text;

/**
 * Created by zub on 30/01/2017.
 */
public class CaesarCipher {
    public static void CaesarCipher() {

        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String inputString = scan.next();
        int key = scan.nextInt();
        //Character array is created to store the input text
        char[] inStrToCharArr = new char[inputString.length()];

        for (int p = 0; p < inputString.length(); p++) {
            int flushV = 0, flushVInc = 0;

            //flushV int variable stores the ASCII values of individual text.
            flushV = (int) inputString.charAt(p);

            /*
            Cap or Non cap letter is checked against ASCII values.
            After identifying the type of letter, it is added to the letter.
            If the new letter exceeds the ASCII limit of alphabets, it is
            bought back by arithmatics.
            */
            if (flushV >= 65 && flushV <= 90) {
                flushVInc = flushV + key;
                if (flushVInc > 90) {
                    while (flushVInc > 90) {
                        flushVInc = 64 + (flushVInc - 90);
                    }
                    inStrToCharArr[p] = (char) flushVInc;
                } else {
                    inStrToCharArr[p] = (char) flushVInc;
                }
            } else if (flushV >= 97 && flushV <= 122) {
                flushVInc = flushV + key;
                if (flushVInc > 122) {
                    while (flushVInc > 122) {
                        flushVInc = 96 + (flushVInc - 122);
                    }

                    //ASCII values are converted back to characters
                    inStrToCharArr[p] = (char) flushVInc;
                } else {
                    inStrToCharArr[p] = (char) flushVInc;
                }
            } else {
                inStrToCharArr[p] = inputString.charAt(p);
            }

        }

        //After coming out of the loop the the new string is returned.
        String codedString = new String(inStrToCharArr);
        System.out.println(codedString);
    }
}
