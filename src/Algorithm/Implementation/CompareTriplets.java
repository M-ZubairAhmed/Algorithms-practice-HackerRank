package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by zub on 29/01/2017.
 */
public class CompareTriplets {
    public static void CompareTriplets(){

        Scanner scan = new Scanner(System.in);
//        int Alice_probClar = scan.nextInt();
//        int Alice_origin = scan.nextInt();
//        int Alice_difficul = scan.nextInt();
//
//        int Bob_probClar = scan.nextInt();
//        int Bob_origin = scan.nextInt();
//        int Bob_difficul = scan.nextInt();

        int[] aliceIndiviScores = new int[3];
        for (int a = 0; a < 3; a++){
            aliceIndiviScores[a] = scan.nextInt();
        }
        int[] bobIndiviScores = new int[3];
        for (int b = 0; b < 3; b++){
            bobIndiviScores[b] = scan.nextInt();
        }

        int sumAliceScore = 0;
        int sumBobScore = 0;
        for (int i = 0; i < 3; i++){
            if (aliceIndiviScores[i] > bobIndiviScores[i]){
                sumAliceScore++;
            }
            if (bobIndiviScores[i] > aliceIndiviScores[i]){
                sumBobScore++;
            }
            if (aliceIndiviScores[i] == bobIndiviScores[i]){
                continue;
            }
        }
        System.out.println(sumAliceScore + " " + sumBobScore);

    }
}
