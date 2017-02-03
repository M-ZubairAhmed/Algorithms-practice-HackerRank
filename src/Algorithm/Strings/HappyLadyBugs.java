package Algorithm.Strings;
import java.util.*;

public class HappyLadyBugs {
    public static void HappyLadyBugs(){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        String[] testCase_Out = new String[testCase];
        for (int a = 0; a < testCase; a++) {
            int cells = scan.nextInt();
            String bugsArrange = scan.next();
            testCase_Out[a] = happyLadyBugsGame(cells, bugsArrange);
        }
        for (int b = 0; b < testCase; b++) {
            System.out.println(testCase_Out[b]);
        }
    }

    //Important calling operations are done from here
    public static String happyLadyBugsGame(int cells, String bugsBoard){
        if (cells != bugsBoard.length()){
            return "String lenght not match";
        }
        int blanks = countUnderscore(bugsBoard);
        if (blanks >= 1){
            if (check_allBugsCanPaired(bugsBoard)){
                return "YES";
            }
            else {
                return "NO";
            }
        }
        else {
            if (check_allbugsAlreadyPaired(bugsBoard)){
                return "YES";
            }
            else {
                return "NO";
            }
        }
    }

    public static int countUnderscore(String bugsBoard){
        int blanks = 0;
        for (int i = 0; i < bugsBoard.length(); i++) {
            if (bugsBoard.charAt(i) == '_'){
                blanks++;
            }
        }
        return blanks;
    }

    public static boolean check_allBugsCanPaired(String bugsBoard){
        HashMap<Character, Integer> alphaFreqMap = new HashMap<>();
        for (int i = 0; i < bugsBoard.length(); i++) {
            Character key = bugsBoard.charAt(i);
            if (key != '_'){
                if (alphaFreqMap.containsKey(key)) {
                    int a = alphaFreqMap.get(key);
                    alphaFreqMap.put(key, a + 1);
                } else {
                    alphaFreqMap.put(key, 1);
                }
            }
        }
        int pairingBugsCount = 0;
        for(Integer a: alphaFreqMap.values()){
            if (a > 1){
                pairingBugsCount++;
            }
        }
        if (pairingBugsCount == alphaFreqMap.size()){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean check_allbugsAlreadyPaired(String bugsBoard){
        if (check_allBugsCanPaired(bugsBoard)){
            if (check_bugsArrangement(bugsBoard)){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public static boolean check_bugsArrangement(String bugsBoard) {
        boolean flag = true;
        for (int i = 1; i + 1 < bugsBoard.length(); i++) {
            if (bugsBoard.charAt(i - 1) == bugsBoard.charAt(i) || bugsBoard.charAt(i) == bugsBoard.charAt(i + 1)){
                continue;
            }
            else {
                flag = false;
            }
        }
        return flag;
    }

}
