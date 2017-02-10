package Algorithm.Implementation;

import java.util.Scanner;

public class TimeConversion {
    public static void hackerrank_timeConversion(){

        Scanner scan = new Scanner(System.in);
        String time = scan.next();
        scan.close();

        String meridian = time.substring(time.length() - 2, time.length());
//        System.out.println(meridian);

        if (meridian.equals("AM")){
            if (time.substring(0,2).equals("12")){
                System.out.println("00"+time.substring(2,time.length()-2));
            }
            else {
                System.out.println(time.substring(0,time.length()-2));
            }
        }
        else {
            if (time.substring(0,2).equals("12")){
                System.out.println(time.substring(0,time.length() - 2));
            }
            else {
                int hour = Integer.valueOf(time.substring(0,2));
                hour = hour + 12;
                System.out.println(hour + time.substring(2,time.length()-2));
            }
        }

    }
}
