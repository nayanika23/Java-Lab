/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nayanikapramanik
 */
import ServiceRoom.*;
import java.util.Scanner;
        
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Laundary ob1= new Laundary();
        Food ob2= new Food();
        Thread t1= new Thread(ob1);
        Thread t2= new Thread(ob2);
        System.out.println("--Room service--");
        t2.start();
        try
        {
            t2.join();
        }
        catch(Exception ex) 
        { 
            System.out.println("Exception has " + 
                                "been caught" + ex); 
        } 
        t1.start();   
    }
}
