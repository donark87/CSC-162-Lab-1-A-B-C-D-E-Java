// Donark Patel
// CSC 162-C1
// Date 5/14/2018
// Lab 1B
// This program calculate hotel occupancy rate.

import java.util.Scanner;
import java.text.NumberFormat;

public class Lab1B {

    public static void main(String [] args)
    {
     int floors,rooms,occupied,vacant,intCount,totalRoom,totalOccupied;
     float OccupancyRate;
        totalRoom = 0;
        totalOccupied = 0;

    Scanner kb = new Scanner (System.in);
    System.out.println("How many floors does the hotel have?");
    floors = kb.nextInt();

    if (floors < 1)
        {
            System.out.println("Error: Please enter number of floors grater then 1");
        }
    else
        {
    for (intCount = 0; intCount < floors; intCount++)
    {
        System.out.println("How many rooms does floor " + (intCount + 1) + " have?");
        rooms = kb.nextInt();
        if (rooms < 10 )
        {
            System.out.println("Error: Please enter number of rooms grater then 10");
        }
        totalRoom = totalRoom + rooms;
        System.out.println("How many occupied rooms does floor " + (intCount + 1) + " have?");
        occupied = kb.nextInt();
        totalOccupied = totalOccupied + occupied;
    }
            vacant = totalRoom - totalOccupied;

            OccupancyRate = (float)totalOccupied / (float)totalRoom;

            NumberFormat nf1 = NumberFormat.getPercentInstance();

            System.out.println("Number of rooms: " + totalRoom);
            System.out.println("Occupied rooms:  " + totalOccupied);
            System.out.println("Vacant rooms: " + vacant);
            System.out.println("Occupancy rate: " + nf1.format(OccupancyRate));
        }
    }
}