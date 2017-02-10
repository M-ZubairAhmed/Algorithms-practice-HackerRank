package Algorithm.Implementation;

import java.util.Scanner;

public class DiagonalDifference {
    public static void DiagonalDifference(){

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        int[][] matrix = new int[size][size];

        for (int a = 0; a < size; a++){
            for (int b = 0; b < size; b++){
                matrix[a][b] = scan.nextInt();
            }
        }
        /*for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }*/
        int i = size - 1;
        int j = size - 1;
        int d1=0;
        while (i >= 0 && j >=0){
            d1 = d1 + matrix[i][j];
            i--;
            j--;
        }
//        System.out.println(d1);
        i = 0;
        j = size - 1;
        int d2 = 0;
        while (i < size && j >=0){
            d2 = d2 + matrix[i][j];
            i++;
            j--;
        }
        System.out.println(Math.abs(d1 -d2));
    }
}
