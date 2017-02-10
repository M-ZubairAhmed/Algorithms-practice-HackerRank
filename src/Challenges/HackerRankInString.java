package Challenges;
import java.util.Scanner;
public class HackerRankInString {
    public static void HackerRankInString(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String[] testIn = new String[testCases];
        for (int z = 0; z < testCases; z++) {
            testIn[z] = scan.next();
        }
        for (int y = 0; y < testCases; y++) {
            System.out.println(checkSubSExists(testIn[y]));
        }
    }
    private static String checkSubSExists(String s){
        char[] subS = {'h','a','c','k','e','r','r','a','n','k'};
        boolean exist = false;
        int cursor = 0;
        if (s.length() < subS.length){
            return "NO";
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == subS[cursor]){
                cursor++;
                exist = true;
                if (cursor >= subS.length){
                    break;
                }
            }
            else {
                exist = false;
            }
        }
        if (exist && cursor == subS.length){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}
