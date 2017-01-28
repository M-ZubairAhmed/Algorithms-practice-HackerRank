package Algorithm.Basics;

import java.util.Scanner;
/**
 * Created by zubair on 28/01/2017.
 */
public class DesignerPDFViewer {
    public static void DesignerPDFViewer(){

        Scanner scan = new Scanner(System.in);
        int[] alphaHeight = new int[26];
        for (int i = 0; i < 5; i++){
            alphaHeight[i] = scan.nextInt();
        }
        String  text = scan.next();
        scan.close();

        int maxH = alphaHeight[text.charAt(0) - 97];
        for (int p = 1; p < text.length(); p++){
            if (alphaHeight[text.charAt(p) - 97] > maxH){
                maxH = alphaHeight[text.charAt(p) - 97];
            }
        }
        System.out.println(maxH * text.length());
    }
}
