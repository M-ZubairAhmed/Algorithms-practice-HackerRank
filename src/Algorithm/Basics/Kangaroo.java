package Algorithm.Basics;

import java.util.Scanner;

public class Kangaroo {
    public static void Kangaroo() {

        Scanner scan = new Scanner(System.in);
        String nArray = scan.nextLine();
        scan.close();

        int[] arr = new int[5];
        int ini = 0;
        int cur = 0;
        for (int i = 0; i < nArray.length(); i++) {
            if (nArray.charAt(i) == ' ') {
                arr[cur] = Integer.valueOf(nArray.substring(ini, i));
                cur++;
                ini = i + 1;
            }
            if (i == nArray.length() - 1) {
                arr[cur] = Integer.valueOf(nArray.substring(ini, nArray.length()));
            }
        }
        int com = 0;
        int d1 = arr[1];
        int a1 = arr[0];
        int d2 = arr[3];
        int a2 = arr[2];
        for (int i = 0; i <= 10000; i++){
            int n1 = a1 + ((i - 1)*d1);
            int n2 = a2 + ((i - 1)*d2);
            if (n1 == n2){
                com++;
                break;
            }
        }
        if (com == 0){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
