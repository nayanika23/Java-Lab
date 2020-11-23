/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;

/**
 *
 * @author nayanikapramanik
 */
public class Booking extends Room {

    static int total_room=50;
    static int room;
    int count;
    int rname;
    public void getdata_room()
      {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No.of rooms you want to book:");
        room= sc.nextInt();
        System.out.println("Enter No.of Person :");
        count= sc.nextInt();
        System.out.println("Standard Room Charge-->Rs 1500");
        System.out.println("Delux Room Charge--> Rs 3000");
        System.out.println("Enter 1 for Standard room \nEnetr 2 for Delux room:");
        rname = sc.nextInt();
      }
    public void room_type(){
       if (rname==1)
        System.out.println("Standard room is selected");
      else
        System.out.println("Delux room is selected"); 
      }
    public void check_room()
    {
        if (total_room<room)
        {
            System.out.println("-----Rooms not Available------.");
        }
        else
        {   
            Random rand = new Random();
            int booking_id= rand.nextInt(1000);
            int room_no= rand.nextInt(200);
            System.out.println("--------Booking Sucessfull!!---------");
            System.out.println("Booking ID is:"+booking_id);
            System.out.println("Room No:"+room_no);
        }
    }
    
     public static class InnerBooking{
        public void avail_room(){
            total_room=total_room-room;
            System.out.println("Number of rooms Available for booking:"+total_room);
    
        }
    } 
}
