package Challenges;
import java.util.Scanner;
public class GameOfTwoStacks {
    public static void test(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- > 0){
            int sizeA = scan.nextInt();
            int sizeB = scan.nextInt();
            int max = scan.nextInt();
            int[] arrayA = new int[sizeA];
            int[] arrayB = new int[sizeB];
            for (int p = 0; p < sizeA; p++) {
                arrayA[p] = scan.nextInt();
            }
            for (int q = 0; q < sizeB; q++) {
                arrayB[q] = scan.nextInt();
            }

            int i=0, j=0, count=0, sum=0;
            while (sum <= max){
                if (arrayA[i] < arrayB[j]){
                    sum+=arrayA[i];
                    i++;
                    count++;
                }
                if (arrayA[i] > arrayB[j]){
                    sum+=arrayA[j];
                    j++;
                    count++;
                }
                else { //equal condition
//                    while ()
                }
            }
            System.out.println(count);

        }
    }
}
