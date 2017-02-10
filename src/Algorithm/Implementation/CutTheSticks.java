package Algorithm.Implementation;

import java.util.*;

public class CutTheSticks {
    public static void CutTheSticks() {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = scan.nextInt();
        }
        Arrays.sort(ar);
        int small = ar[0];
        System.out.println(ar.length);
        for (int s = 0; s < ar.length; s++) {
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                ar[i] = ar[i] - small;
                if (ar[i] > 0) {
                    count++;
                }
            }
            if (count == 0){
                break;
            }
            else {
                System.out.println(count);
            }
            for (int j = 0; j < ar.length; j++) {
                if (ar[j] <= 0){
                    continue;
                }
                else {
                    small = ar[j];
                    break;
                }
            }
        }
    }
}
