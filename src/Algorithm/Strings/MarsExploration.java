package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by zub on 30/01/2017.
 */
public class MarsExploration {
    public static void MarsExploration(){

        Scanner scan = new Scanner(System.in);
        String unfltrStr = scan.next();
        scan.close();

        int lettersLost = 0;

        for (int i = 0; i < unfltrStr.length(); i++){
            int iSignal = i % 3;
            if (iSignal == 0 || iSignal == 2){
                if (unfltrStr.charAt(i) != 'S'){
                    lettersLost++;
                }
            }
            else {
                if (unfltrStr.charAt(i) != 'O'){
                    lettersLost++;
                }
            }
        }
        System.out.println(lettersLost);

    }
}
