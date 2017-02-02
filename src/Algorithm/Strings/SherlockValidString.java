package Algorithm.Strings;

import java.util.*;

public class SherlockValidString {
    public static void SherlockValidString() {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        if (input.length() <= 1) {
            System.out.println(input);
        } else {
            HashMap<Character, Integer> alphaFreqMap = new HashMap<>();

            for (int i = 0; i < input.length(); i++) {
                Character key = input.charAt(i);
                if (alphaFreqMap.containsKey(key)) {
                    int a = alphaFreqMap.get(key);
                    alphaFreqMap.put(key, a + 1);
                } else {
                    alphaFreqMap.put(key, Integer.valueOf(1));
                }
            }
            int[] alphaFreqAr = new int[alphaFreqMap.size()];

            Set entry = alphaFreqMap.entrySet();
            Iterator iter = entry.iterator();
            int p = 0;
            while (iter.hasNext()) {
                Map.Entry mapping = (Map.Entry) iter.next();
                alphaFreqAr[p] = Integer.valueOf(mapping.getValue().toString());
                p++;
            }
            Arrays.sort(alphaFreqAr);

            boolean splCase = false;
            int splNo = 0;
            int splCount = 0;
            if (alphaFreqAr[0] == 1) {
                splCase = true;
                splNo = alphaFreqAr[1];
            }

            int sum = 0;
            int min = alphaFreqAr[0];
            for (int a = 0; a < alphaFreqAr.length; a++) {
                if (splCase && a > 1 && alphaFreqAr[a] == splNo) {
                    splCount++;
                }
                alphaFreqAr[a] = alphaFreqAr[a] - min;
                sum = sum + alphaFreqAr[a];
            }
            if (sum == 1 || sum == 0 || splCount == alphaFreqAr.length - 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}
