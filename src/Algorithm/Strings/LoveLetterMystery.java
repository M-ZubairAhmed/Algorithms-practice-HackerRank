package Algorithm.Strings;

import java.util.Scanner;
public class LoveLetterMystery {
    public static void LoveLetterMystery(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String[] testIn = new String[testCases];
        int[] testOut = new int[testCases];
        for (int z = 0; z < testCases; z++) {
            testIn[z] = scan.next();
        }
        for (int y = 0; y < testCases; y++) {
            testOut[y] = countSteps2Palindrome(testIn[y]);
            System.out.println(testOut[y]);
        }
    }

    private static int countSteps2Palindrome(String str){
        int strLen = str.length();
        int steps = 0;
        StringBuilder strRv = new StringBuilder(str);
        strRv.reverse();
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) > strRv.charAt(i)){
                steps = steps + (str.charAt(i) - strRv.charAt(i));
            }
        }
        return steps;
    }
}
