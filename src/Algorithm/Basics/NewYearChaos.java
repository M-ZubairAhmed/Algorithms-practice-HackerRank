package Algorithm.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {
    public static void NewYearChaos() {

        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while (testCases > 0) {
            testCases--;
            int countPeople = input.nextInt();
            int[] givenQue = new int[countPeople];
            for (int a = 0; a < countPeople; a++) {
                givenQue[a] = input.nextInt();
            }
            int[] countingBribesAr = new int[countPeople + 1];
            boolean chaos = false;
            boolean finished = false;
            int countBribe = 0;
            while (!finished) {
                finished = true;
                for (int a = 0; a < countPeople - 1; a++) {
                    if (givenQue[a] > givenQue[a + 1]) {
                        countingBribesAr[givenQue[a]]++;
                        if (countingBribesAr[givenQue[a]] > 2) {
                            finished = true;
                            chaos = true; // if it's too chaotic, break out
                            break;
                        }
                        countBribe++;
                        int temp = givenQue[a];
                        givenQue[a] = givenQue[a + 1];
                        givenQue[a + 1] = temp;
                        finished = false;
                    }
                }
            }
            if (chaos) {
                System.out.println("Too chaotic");
            } else {
                System.out.println(countBribe);
            }
        }
    }
}
