package com.Algorithm.Basics;

import java.util.Scanner;

public class BonAppetit {

    public static void BonAppetit(){
        Scanner scan = new Scanner(System.in);
        int numItems = scan.nextInt();
        int annaDiscardedItem = scan.nextInt();
        int[] itemPrices = new int[numItems];
        for (int z = 0; z < numItems; z++){
            itemPrices[z] = scan.nextInt();
        }
        int sharePreAdjustment = scan.nextInt();

        int sumPostAdjustment = 0;
        for (int i = 0; i < numItems; i++){
            if (i != annaDiscardedItem){
                sumPostAdjustment = sumPostAdjustment + itemPrices[i];
            }
        }
        int sharePostAdjustment = sumPostAdjustment / 2;
        if (sharePostAdjustment == sharePreAdjustment){
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(Math.abs(sharePostAdjustment - sharePreAdjustment));
        }
    }
}
