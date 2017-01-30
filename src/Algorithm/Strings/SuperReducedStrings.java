package Algorithm.Strings;

import java.util.Scanner;

/**
 * Created by zub on 30/01/2017.
 */
public class SuperReducedStrings {
    public static void SuperReducedStrings(){

        Scanner scan = new Scanner(System.in);
        String inputStr = scan.next();
        StringBuilder inputStrBld = new StringBuilder(inputStr);

        if (inputStr != null){

            int operationCount = 0;
            int cursor = 0;
            boolean loop = true;
            while (true){
                if (cursor + 1 < inputStrBld.length()){
                    if (inputStrBld.charAt(cursor) == inputStrBld.charAt(cursor + 1)){
                        inputStrBld.deleteCharAt(cursor);
                        inputStrBld.deleteCharAt(cursor);
                        operationCount++;
                    }
                    cursor++;
                }
                else {
                    if (operationCount == 0){
                        loop = false;
                        break;
                    }
                    else {
                        cursor = 0;
                        operationCount = 0;
                    }

                }
            }
        }
        if (inputStrBld.length() == 0){
            System.out.println("Empty String");
        }
        else {
            System.out.println(inputStrBld);
        }

    }
}
