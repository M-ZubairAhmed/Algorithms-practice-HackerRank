package Algorithm.Implementation;

import java.util.Scanner;

public class PlusMinus {
    public static void hackerrank_plusminus() {

        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        scan.nextLine();
        String nArray = scan.nextLine();
        scan.close();

        String[] numbers = new String[search];

        int ini = 0;
        int arrayCur = 0;

        for (int i = 0; i < nArray.length(); i++) {
            if (nArray.charAt(i) == ' ') {
                numbers[arrayCur] = nArray.substring(ini, i);
                arrayCur++;
                ini = i + 1;
            }
            if (i == nArray.length() - 1) {
                numbers[arrayCur] = nArray.substring(ini, nArray.length());
            }
        }
        float neg = 0;
        float pos = 0;
        float zer = 0;
        for (int j = 0; j < numbers.length; j++) {
//            sum = sum + Long.valueOf(numbers[j]);
            if (Integer.valueOf(numbers[j]) > 0) {
                pos++;
            } else if (Integer.valueOf(numbers[j]) < 0) {
                neg++;
            } else {
                zer++;
            }
        }
        System.out.println(pos / search);
        System.out.println(neg / search);
        System.out.println(zer / search);

    }
}
