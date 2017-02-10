package Algorithm.Implementation;

import java.util.Scanner;

public class LibraryFine {
    public static void LibraryFine(){

        Scanner scan = new Scanner(System.in);
        int[] duereturn = new int[3];
        int[] returned = new int[3];

        for (int i = 0; i < 6; i++) {
           if (i <= 2){
               returned[i] = scan.nextInt();
           }
           else {
               duereturn[i-3] = scan.nextInt();
           }
        }

        if (returned[2] < duereturn[2]){
            System.out.println(0);
        }
        else if (returned[2] > duereturn[2]){
            System.out.println(10000);
        }
        else {
            if (returned[1] < duereturn[1]){
                System.out.println(0);
            }
            else if (returned[1] > duereturn[1]){
                System.out.println(500 * (returned[1] - duereturn[1]));
            }
            else {
                if (returned[0] < duereturn[0]){
                    System.out.println(0);
                }
                else if (returned[0] > duereturn[0]){
                    System.out.println(15 * (returned[0] - duereturn[0]));
                }
                else {
                    System.out.println(0);
                }
            }
        }
    }
}
