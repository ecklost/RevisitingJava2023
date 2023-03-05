package jparseint;

import java.math.*;
import java.io.*;
import java.util.Scanner;

public class JParseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        String scString = sc.nextLine();
        System.out.println();
        int JReturnInt = JParseInt(scString);
        System.out.println(JReturnInt);
    }
    
    public static int JParseInt(String strNumber) {
        char[] charNumber = strNumber.toCharArray();
        int strNumberLength;
        int runningTotal = 0;
                
        strNumberLength = strNumber.length();
        
        for(int i = 0; i < strNumberLength; i++ ) {
            switch(charNumber[i]) {
                case '1':
                    runningTotal += (1*Math.pow(10, strNumberLength - i-1));
                    break;
                case '2':
                    runningTotal += (2*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '3':
                    runningTotal += (3*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '4':
                    runningTotal += (4*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '5':
                    runningTotal += (5*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '6':
                    runningTotal += (6*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '7':
                    runningTotal += (7*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '8':
                    runningTotal += (8*Math.pow(10, strNumberLength - i-1));
                    break;
                 case '9':
                    runningTotal += (9*Math.pow(10, strNumberLength - i-1));
                    break;
                default:
                    runningTotal = runningTotal;
                    break;
            }
        }
        
        return runningTotal;
    }
    
}
