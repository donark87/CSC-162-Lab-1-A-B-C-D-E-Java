// Donark Patel
// CSC 162-C1
// Date 5/14/2018
// Lab 1A
// This application calculate total charges of the internet usage

import java.text.NumberFormat;
import java.util.Scanner;
public class Lab1A
{
    public static void main (String [] args){

        char packageType; //Package type
        float hours,additionalHours,totalCharges ;
        String str;
        final float aPrice = 9.95f;
        final float bPrice = 13.95f;
        final float cPrice = 19.95f;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter package type");
        str = kb.nextLine();
        str = str.toUpperCase();
        packageType = str.charAt(0);
        System.out.println("Enter how many hours cable were used");
        hours = kb.nextFloat();

        NumberFormat nf1 = NumberFormat.getCurrencyInstance();
        NumberFormat nf2 = NumberFormat.getPercentInstance();
        if (packageType == 'A')
        {
            if (hours > 10)
            {
                additionalHours = hours - 10;
                totalCharges = 2.0f * additionalHours;
                totalCharges = totalCharges + aPrice;
            }
            else
                {
                    totalCharges = aPrice;
                }
            System.out.println("Package type: " + packageType);
            System.out.println("Total hours used: "+hours);
            System.out.printf("Total charges: "+ nf1.format(totalCharges));
            System.out.println("");


        }
        else if (packageType == 'B')
        {
            if (hours > 20)
            {
                additionalHours = hours - 20;
                totalCharges = 1.0f * additionalHours;
                totalCharges = totalCharges + bPrice;
            }
            else
            {
                totalCharges = bPrice;
            }
            System.out.println("Package type: " + packageType);
            System.out.println("Total hours used: "+hours);
            System.out.printf("Total charges: "+ nf1.format(totalCharges));
            System.out.println("");


        }
        else if (packageType == 'C')
        {
            totalCharges = cPrice;
            System.out.println("Package type: " + packageType);
            System.out.println("Total hours used: "+hours);
            System.out.printf("Total charges: "+ nf1.format(totalCharges));
            System.out.println("");

        }
        else
            {
                System.out.println("Error: incorrect package type selected");

            }




















    }
}
