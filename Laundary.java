/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRoom;

import java.util.Scanner;

/**
 *
 * @author nayanikapramanik
 */
public class Laundary implements Runnable {
    Scanner sc = new Scanner(System.in);
    public void run()
    {
    final int washing=15;
    final int ironing=10;
    System.out.println("Welcome to laundary service:");
    System.out.println("Number of clothes:");
    int item=Integer.parseInt(sc.nextLine());
    System.out.println("--Laundary service--\nEnter 1 for washing\nEnter 2 for ironing");
    int ch = Integer.parseInt(sc.nextLine());
    switch(ch)
    {
        case 1:
            System.out.println("Total Washing Charges= Rs "+ washing * item);
            break;
        case 2:  
            System.out.println("Total Ironing Charges= Rs "+ ironing * item);
            break;
            
    }
    }
    
    
}
