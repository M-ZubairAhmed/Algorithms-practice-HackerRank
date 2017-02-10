package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by zub on 29/01/2017.
 */
public class ModifyTheSeq {
    public static void ModifyTheSeq(){

        Scanner scan = new Scanner(System.in);
        int noOfDays = scan.nextInt();
        int addReach = 0;
        int sharedTo = 5;
        for (int i = 1; i <= noOfDays; i++){
            int likedCurrentDay = Math.floorDiv(sharedTo,2);
            int sharedCurrentDay = likedCurrentDay*3;
            addReach = addReach + likedCurrentDay;
            sharedTo = sharedCurrentDay;

        }
        System.out.println(addReach);
    }
}
