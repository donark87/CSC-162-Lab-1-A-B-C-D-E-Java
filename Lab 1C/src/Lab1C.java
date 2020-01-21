// Donark Patel
// CSC 162-C1
// Date 5/14/2018
// Lab 1C
// This program calculate cost of paint job


import javax.swing.JOptionPane;
import java.text.NumberFormat;
public class Lab1C {
    public static void main(String [] args)
    {
      int numberOfRooms, squareFeet, totalSquareFeet, inCount;
      float pricePerGallon,totalGallons, totalLabor, totalCostOfPaint,totalCostOfLabor,totalCostOfJob;
      String str;
      final float laborCostPerHour = 18.00f;
      totalSquareFeet = 0;

        str = JOptionPane.showInputDialog("How many rooms to paint?");
        numberOfRooms = Integer.parseInt(str);


        for (inCount = 0; inCount < numberOfRooms; inCount++ )
        {
            str = JOptionPane.showInputDialog("Enter the square feet for room number " + (inCount + 1) + "?");
            squareFeet = Integer.parseInt(str);
            totalSquareFeet = totalSquareFeet + squareFeet;
        }

            str = JOptionPane.showInputDialog("Enter the price of paint per gallon?");
            pricePerGallon = Float.parseFloat(str);
            totalGallons = getTotalGallons(totalSquareFeet);

            totalLabor = getTotalLabor(totalSquareFeet);

            totalCostOfPaint = GetTotalCostOfPaint(totalGallons,pricePerGallon);

            totalCostOfLabor = getTotalCostOfLabor(totalLabor,laborCostPerHour);

            totalCostOfJob = getTotalCostOfJob(totalCostOfPaint,totalCostOfLabor);


        NumberFormat nf = NumberFormat.getCurrencyInstance();

        JOptionPane.showMessageDialog(null, String.format("The total estimated cost is " + nf.format(totalCostOfJob)));

    }
    private static float getTotalCostOfJob(float totalCostOfPaint, float totalCostOfLabor){
        return totalCostOfPaint + totalCostOfLabor;
    }
    private static float getTotalCostOfLabor(float totalLabor,float laborCostPerHour) {
        return totalLabor * laborCostPerHour;
    }

    private static float GetTotalCostOfPaint(float totalGallons, float pricePerGallon) {
        return totalGallons * pricePerGallon;
    }

    private static float getTotalLabor(float totalSquareFeet) {
        return (totalSquareFeet / 115) * 8;
    }

    private static float getTotalGallons(float totalSquareFeet) {

        return  totalSquareFeet / 115;

    }
}
