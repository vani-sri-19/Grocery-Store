/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

/**
 *
 * @author Vanisri Kirubakaran
 */
public class Not_member extends Bill{
    
    private double bill_amt=total; 
    
    public void total_cost()
    {
        System.out.println("-------------------");
        
         if(bill_amt>100)
        {
            System.out.println("5% discount");
            bill_amt = bill_amt - (0.05 * bill_amt);
            System.out.printf("Total bill cost: "+ bill_amt);
        }
         else
        {
            System.out.println("Sorry, No Discount");
            System.out.printf("Total bill cost: "+ bill_amt);
        }
    }
    
}
