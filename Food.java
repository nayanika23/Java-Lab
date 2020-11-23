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
public class Food implements Runnable{
    Scanner sc = new Scanner(System.in);
    public void run()
    {
        System.out.println("--Food Menu--\nEnter 1 for Lunch\nEnter 2 for dinner:");
        int ch = Integer.parseInt(sc.nextLine());
        switch(ch)
        {
            case 1:
                System.out.println("Lunch has been ordered.");
                break;
            case 2:
                System.out.println("Dinner has been ordered.");
                break;
        }
        
    }
    
}
