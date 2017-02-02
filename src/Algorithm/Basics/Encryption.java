package Algorithm.Basics;

import java.util.Scanner;

public class Encryption {
    public static void Encryption(){

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();

        str = str.replaceAll("\\s","");
        int len = str.length();
        if (len <= 1){
            System.out.println(str);
        }
        else {
            int row = (int)Math.floor(Math.sqrt(len));
            int col = (int)Math.ceil(Math.sqrt(len));
            if (row * col < len){
                row++;
            }
            System.out.println(row + "x" + col);

            StringBuilder en1 = new StringBuilder();
            for (int i = 0; i < len; i++) {
                if (i % col ==0 && i != 0){
                    en1.append(" ");
                }
                en1.append(str.charAt(i));
            }
            System.out.println(en1);
            StringBuilder en2 = new StringBuilder();
            for (int p = 0; p <= row; p++) {
                en2.append(en1.charAt(p));
                for (int q = 0; q < en1.length() ; q++) {
                    if (en1.charAt(q) == ' ' && (q+p+1) < en1.length()){
                        en2.append(en1.charAt(q+p+1));
                    }
                }
                en2.append(" ");
            }
            System.out.println(en2.toString().trim());
        }
    }
}
