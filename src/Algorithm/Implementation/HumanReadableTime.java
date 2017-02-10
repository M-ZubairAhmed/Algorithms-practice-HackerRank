package Algorithm.Implementation;

import java.util.Scanner;

/**
 * Created by zubair on 28/01/2017.
 */
public class HumanReadableTime {

    public static void HumanReadableTime() {

        Scanner scan = new Scanner(System.in);
        int inputSeconds =scan.nextInt();
        scan.close();

        int hh = inputSeconds / (60*60);
        int hhRem = inputSeconds % (60*60);
        String hours = String.format("%02d",hh);

        int mm = hhRem / 60;
        int mmRem = hhRem % 60;
        String minutes = String.format("%02d",mm);

        int ss;
        if (mmRem <= 60){
            ss = mmRem%60;
        }
        else {
            ss = mmRem / 60;
        }
        String second = String.format("%02d",ss);

        System.out.println(hours + ":" + minutes + ":" + second);
    }
}
