package Algorithm.Basics;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public class BeautifulTriplets {
    public static void BeautifulTriplets(){
        Scanner scan = new Scanner(System.in);
        int listSize = scan.nextInt();
        int beauDiff = scan.nextInt();
        int[] noteList = new int[listSize];
        for (int z = 0; z < listSize; z++) {
            noteList[z] = scan.nextInt();
        }

        int noteDiffCount = 0;
        for (int i = 0; i < listSize; i++) {
            int elem1 = noteList[i];
            int elem2 = noteList[i] + beauDiff;
            int elem2Find = Arrays.binarySearch(noteList,i,noteList.length,elem2);
            if (elem2Find > 0){
                int elem3 = elem2 + beauDiff;
                int elem3Find = Arrays.binarySearch(noteList,elem2Find,noteList.length,elem3);
                if (elem3Find > 0){
                    noteDiffCount++;
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }
        System.out.println(noteDiffCount);
    }
}
