package Challenges;
import java.util.Scanner;
public class BreakingTheRecord {
    public static void test(){
        Scanner scan = new Scanner(System.in);
        int games = scan.nextInt();
        int[] scores = new int[games];
        for (int i = 0; i < games; i++) {
            scores[i] =scan.nextInt();
        }
        int recordHigh = scores[0];
        int recordLow = scores[0];
        int recordHighBreak = 0;
        int recordLowBreak = 0;

        for (int i = 0; i < games - 1; i++) {
            if (recordHigh < scores[i+1]){
                recordHigh = scores[i+1];
                recordHighBreak++;
            }
            if (recordLow > scores[i+1]){
                recordLow = scores[i+1];
                recordLowBreak++;
            }
        }

        System.out.println(recordHighBreak);
        System.out.println(recordLowBreak);
    }
}
