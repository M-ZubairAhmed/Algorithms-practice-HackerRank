package Algorithm.Basics;

import java.util.Scanner;

/**
 * Created by zubair on 28/01/2017.
 */
public class AppleOrange {
    public static void AppleOrange(){

        Scanner scan = new Scanner(System.in);
        int houseStart = scan.nextInt();
        int houseEnd = scan.nextInt();
        int applePos = scan.nextInt();
        int orangePos = scan.nextInt();
        int applesNos = scan.nextInt();
        int orangeNos = scan.nextInt();
        int[] appleDist = new int[applesNos];
        int[] orangeDist = new int[orangeNos];
        for (int y = 0; y < applesNos; y++){
            appleDist[y] = scan.nextInt();
        }
        for (int z = 0; z < orangeNos; z++){
            orangeDist[z] = scan.nextInt();
        }

        int catchApple = 0;
        for (int i = 0; i < applesNos; i++){
            int disApple = appleDist[i] + applePos;
            if (disApple >= houseStart && disApple <= houseEnd){
                catchApple++;
            }
        }
        int catchOrange = 0;
        for (int j = 0; j <orangeNos; j++){
            int disOrange = orangeDist[j] + orangePos;
            if (disOrange <= houseEnd && disOrange >= houseStart){
                catchOrange++;
            }
        }
        System.out.println(catchApple + "\n" + catchOrange);

    }
}
