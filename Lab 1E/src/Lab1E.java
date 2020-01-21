// Donark Patel
// CSC 162-C1
// Date 5/14/2018
// Lab 1D
// This program grades

import java.util.Arrays;
import java.util.Scanner;
import java.text.NumberFormat;
public class Lab1E
{
    public static void main(String [] args)
    {
        float amount;
        int intCount = 0;
        float quarter1Sum = 0;
        float quarter2Sum = 0;
        float quarter3Sum = 0;
        float quarter4Sum = 0;

        Scanner kb = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

    float [] [] sales = new float [6] [4];

    for (int row = 0; row < sales.length;row++){
        for (int col = 0; col < sales[0].length;col++){
            System.out.println("Enter sales amount for department " + (row + 1) + " Quarter " + (col + 1));
            sales[row][col] = kb.nextFloat();
        }
    }

        for (int row = 0; row < sales.length; row++) {
            System.out.println("Division: " + (intCount +1));
            intCount++;
            for (int col = 0; col < sales[0].length; col++) {
                System.out.println("Quarter " + (col + 1) + ":" + nf.format(sales[row][col]) );
            }
        }

        for (int row = 0; row < sales.length; row++) {

                quarter1Sum += sales[row][0];
                quarter2Sum += sales[row][1];
                quarter3Sum += sales[row][2];
                quarter4Sum += sales[row][3];

            //}
        }
        System.out.println("Sales Amount By Quarter");
        System.out.println("Quarter1: " + nf.format(quarter1Sum));
        System.out.println("Quarter2: " + nf.format(quarter2Sum));
        System.out.println("Quarter3: " + nf.format(quarter3Sum));
        System.out.println("Quarter4: " + nf.format(quarter4Sum));







       }
}
