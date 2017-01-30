package Algorithm.Strings;

import java.util.Scanner;

public class FunnyStrings {
    public static void FunnyStrings() {

        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        String[] inputStrings = new String[testCases];
        for (int a = 0; a < testCases; a++) {
            inputStrings[a] = scan.next();
        }
        scan.close();

        for (int b = 0; b < testCases; b++) {
            System.out.println(funnyOrNot(inputStrings[b]));
        }

    }

    public static String funnyOrNot(String straightStr) {

        StringBuilder reversedStr = new StringBuilder();
        reversedStr.append(straightStr);
        reversedStr = reversedStr.reverse();
        int len = straightStr.length();

        String output = null;
        for (int i = 0; i < len - 1; i++) {
            int diffStraight = Math.abs(straightStr.charAt(i) - straightStr.charAt(i + 1));
            int diffReversed = Math.abs(reversedStr.charAt(i) - reversedStr.charAt(i + 1));
            if (diffStraight == diffReversed) {
                output = "Funny";
                continue;
            } else {
                output = "Not Funny";
                break;
            }
        }
        return output;
    }
}


