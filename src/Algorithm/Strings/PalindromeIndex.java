package Algorithm.Strings;
import java.util.Scanner;
public class PalindromeIndex {
    public static void PalindromeIndex(){
        Scanner scan = new Scanner(System.in);
        int testcases = scan.nextInt();
        String[] testIn = new String[testcases];
        int[] testOut = new int[testcases];
        for (int z = 0; z < testcases; z++) {
            testIn[z] = scan.next();
        }
        for (int y = 0; y < testcases; y++) {
            testOut[y] = getPalindromeIndex(testIn[y]);
            System.out.println(testOut[y]);
        }
    }

    private static int getPalindromeIndex(String str){
        int index = 0;
        int len = str.length();
        StringBuilder strBld = new StringBuilder(str);
        strBld.reverse();
        String strRev = new String(strBld);
        if (str.equals(strRev)){
            return -1;
        }
        else {
            for (int i = 0; i < len; i++) {
                int j = len - 1 - i;
                if (i == j){
                    break;
                }
                else {
                    char iChar = str.charAt(i);
                    char jChar = str.charAt(j);
                    if (iChar == jChar){
                        continue;
                    }
                    else {
                        index = i;
                        break;
                    }
                }
            }
        }
        boolean try1 = checkPalindrome(str,index);
        if (try1){
            return index;
        }
        else {
            return len - 1 - index;
        }
    }

    private static boolean checkPalindrome(String s, int i){
        StringBuilder sB = new StringBuilder(s);
        StringBuilder sbR = new StringBuilder(s);
        sB.deleteCharAt(i);
        sB.reverse();
        sbR.deleteCharAt(i);
        if (sB.toString().equals(sbR.toString())){
            return true;
        }
        else {
            return false;
        }
    }
}
