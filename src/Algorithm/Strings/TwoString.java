package Algorithm.Strings;
import java.util.Scanner;
public class TwoString {
    public static void TwoString(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String[] testOut = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String aStr = scan.next();
            String bStr = scan.next();
            testOut[i] = containsCommonSubStr(aStr, bStr);
        }
        for (int j = 0; j < testCases; j++) {
            System.out.println(testOut[j]);
        }
    }
    private static String containsCommonSubStr(String x, String y){
        int[] alphaFreqX = calculateAlphaFreq(x);
        int[] alphaFreqY = calculateAlphaFreq(y);
        boolean commonExists = false;
        for (int l = 0; l < 26; l++) {
            if (alphaFreqX[l] >= 1 && alphaFreqY[l] >= 1){
                commonExists = true;
                break;
            }
        }
        if (commonExists){
            return "YES";
        }
        else {
            return "NO";
        }
    }
    private static int[] calculateAlphaFreq(String input){
        int[] alphaFreq = new int[26];
        for (int p = 0; p < input.length(); p++) {
            int pos = input.charAt(p) - 97;
            alphaFreq[pos]++;
        }
        return alphaFreq;
    }
}
