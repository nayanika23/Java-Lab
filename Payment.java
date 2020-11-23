/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author nayanikapramanik
 */
public class Payment extends Booking implements RoomCharge {
    double cost;
    public void total_cost()
    {
        if (rname==1)
        {
            cost = room * sroom;
        }
        else
        { 
            cost = room * droom;
        
        }
        
    System.out.println("Total amount to be paid:"+cost);
    }
    
}    
