package com.mzubairahmed;

import java.util.Scanner;

public class TimeInWords {

    public static void TimeInWords(){

        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int mins = scan.nextInt();
        scan.close();

        String[] alphaNum = {"zero", "one", "two","three", "four", "five", "six", "seven", "eight", "nine","ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty"};

        if (mins == 0){
            System.out.println(alphaNum[hour] + " o' clock");}
        else if(mins == 1){
            System.out.println(alphaNum[mins] + " minute past " + alphaNum[hour]);}
        else if(mins >= 2 && mins <= 29 && mins != 15){
            System.out.println(alphaNum[mins] + " minutes past " + alphaNum[hour]);}
        else if(mins == 15){
            System.out.println("quarter past " + alphaNum[hour]);}
        else if(mins == 30){
            System.out.println("half past " + alphaNum[hour]);}
        else if(mins >= 31 && mins <= 44){
            System.out.println(alphaNum[60 - mins] + " minutes to " + alphaNum[hour + 1]);}
        else if(mins == 45){
            System.out.println("quarter to " + alphaNum[hour + 1]);}
        else if(mins >= 46 && mins <= 59){
            System.out.println(alphaNum[60 - mins] + " minutes to " + alphaNum[hour + 1]);}
        else if(mins == 59){
            System.out.println(alphaNum[60 - 59] + " minute to "+ alphaNum[hour + 1]);}
        else {
            System.out.println("incorrect time");}

    }
}
