package Challenges;
import java.util.Scanner;
public class MigratoryBirds {
    public static void MigratoryBird(){
        Scanner scan = new Scanner(System.in);
        int numBirds = scan.nextInt();
        int[] flock = new int[numBirds];
        for (int a = 0; a < numBirds; a++) {
            flock[a] = scan.nextInt();
        }

        int[] speciesCount = new int[6];
        for (int j = 0; j < numBirds; j++) {
            speciesCount[flock[j]]++;
        }

        int max = speciesCount[0];
        int maxIndex = 0;
        for (int k = 0; k <= 5; k++) {
            if (speciesCount[k] > max){
                max = speciesCount[k];
                maxIndex = k;
            }
        }
        System.out.println(maxIndex);
    }
}
