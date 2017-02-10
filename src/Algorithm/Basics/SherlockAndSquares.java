package Algorithm.Basics;
import java.util.Scanner;
public class SherlockAndSquares {
    public static void SherlockAndSquare(){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        int[] testInput = new int[testCases];
        int[] testResult = new int[testCases];
        for (int z = 0; z < testCases; z++) {
            int upperL = scan.nextInt();
            int lowerL = scan.nextInt();
            testResult[z] = getNumPerfectSq(upperL,lowerL);
        }
        for (int y = 0; y < testCases; y++) {
            System.out.println(testResult[y]);
        }
    }

    public static int getNumPerfectSq(int upL, int loL){
        int perfectSqRtNos;
        double upSqRCeil = Math.ceil(Math.sqrt(upL));
        double loSqR = Math.sqrt(loL);
        double loSqCeil = Math.ceil(loSqR);
        //Because all the numbers between the range has to be perfect squares
        perfectSqRtNos = (int)(loSqCeil - upSqRCeil);
        if (loSqR == loSqCeil){
            perfectSqRtNos++;
        }
        return perfectSqRtNos;
    }
}
