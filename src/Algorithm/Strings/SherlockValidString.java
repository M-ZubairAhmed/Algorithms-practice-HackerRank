package Algorithm.Strings;

import java.util.*;

public class SherlockValidString{
    public static void SherlockValidString(){

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        HashMap<Character,Integer> alpha = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character key = str.charAt(i);
            if (alpha.containsKey(key)){
                int a = alpha.get(key);
                alpha.put(key,a + 1);
            }
            else {
                alpha.put(key,Integer.valueOf(1));
            }
        }
        int[] ar = new int[alpha.size()];

        Set entry = alpha.entrySet();
        Iterator iter = entry.iterator();
        int p = 0;
        while (iter.hasNext()){
            Map.Entry mapping = (Map.Entry) iter.next();
            ar[p] = Integer.valueOf(mapping.getValue().toString());
            p++;
        }
        Arrays.sort(ar);
        int delNos = 0;
        int sum = 0;
        int min = ar[0];
        boolean splCase = false;
        for (int a = 0; a < ar.length; a++) {
            if (ar[0] ==1){
                if (ar[a + 1] == ar[a + 2])
            }
            ar[a] = ar[a] - min;
            sum = sum + ar[a];
        }
        if (sum == 1 || sum == 0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
