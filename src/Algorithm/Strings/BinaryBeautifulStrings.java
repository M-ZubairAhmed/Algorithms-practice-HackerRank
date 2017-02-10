package Algorithm.Strings;
import java.util.Scanner;
public class BinaryBeautifulStrings {
    public static void BinaryBeautifulString(){
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        String str = scan.next();
        int i = 0;
        int count = 0;
        while(i < len){
            if (i < len && i+4 < len) {
                if (str.substring(i, i + 3).equals("010")) {
                    count++;
                    i = i + 3;
                } else {
                    i++;
                }
            }
            else {
                break;
            }
        }
        System.out.println(count);
    }
}
