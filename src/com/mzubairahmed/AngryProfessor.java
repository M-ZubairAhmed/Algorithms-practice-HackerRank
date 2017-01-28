package com.mzubairahmed;

import java.util.Scanner;

public class AngryProfessor {
    public static void AngryProfessor(){

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int z = 1; z <= t; z++){
            int studentsInClass = scan.nextInt();
            int proffThreshold = scan.nextInt();
            int[] studentTimingsAr = new int[studentsInClass];
            for (int y = 0; y < studentsInClass; y++){
                studentTimingsAr[y] = scan.nextInt();
            }
            System.out.println(classStatus(studentTimingsAr, proffThreshold));
        }
    }

    public static String classStatus( int[] studentsTimings, int proffesorThreshold ){

        int ontimeStudents = 0;
        for (int i = 0; i < studentsTimings.length; i++){
            if (studentsTimings[i] > 0){
                continue;
            }
            else {
                ontimeStudents++;
            }
        }
        if (ontimeStudents >= proffesorThreshold){
            return "NO";
        }
        else {
            return "YES";
        }
    }
}
