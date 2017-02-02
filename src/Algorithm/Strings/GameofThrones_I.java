package Algorithm.Strings;
import java.util.Scanner;
public class GameofThrones_I {
     public static void GameofThrones_I(){

         Scanner scan = new Scanner(System.in);
         String kingsKey = scan.next();
         scan.close();

         int[] alphaFreqAr = new int[26];

         for (int i = 0; i < kingsKey.length(); i++) {
            int alpha = kingsKey.charAt(i) - 97;
            alphaFreqAr[alpha]++;
         }

         int countAlpha = 0;
         int countEven = 0;
         int countOdd = 0;
         for (int j = 0; j < alphaFreqAr.length; j++) {
             if (alphaFreqAr[j] != 0){
                 countAlpha++;
             }
             if (alphaFreqAr[j] % 2 ==0 && alphaFreqAr[j] > 0){
                 countEven++;
             }
             if (alphaFreqAr[j] % 2 != 0 && alphaFreqAr[j] > 0){
                 countOdd++;
             }
         }
         System.out.println(countAlpha + "," + countEven + "," + countOdd);
        if (((countEven == countAlpha - 1)||(countEven == countAlpha)) && (countOdd <= 1)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }


     }
}
