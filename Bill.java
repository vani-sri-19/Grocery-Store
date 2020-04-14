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
public class Bill {
      
 private User user;
 private Product product; 
 private int id;
 private int quantity;
 protected static double total;
 
  /*  public Bill(User u,Product p,int qty)..abstarct,interface
    {
        this.user=u;
        this.product=p;
        this.quantity=qty;
        
        calc_total();  
        
    }*/
    public void bi(User u,Product p,int qty)
    {
        this.user=u;
        this.product=p;
        this.quantity=qty;
        
        calc_total();
    }
    
   
    public void calc_total()
    {
        this.total += this.quantity * product.get_cost();
    }
   
    public void display_bill()
    {
        System.out.println("\n product details-");
        System.out.println(" username- "+user.getfirst_name()+user.getlast_name());
        System.out.println(" product- "+product.get_product());
        System.out.println(" cost per lg/pkt- "+product.get_cost());
        System.out.println(" quantity- "+quantity);
    }
    public void total_cost(){
        System.out.println("------------------");
        System.out.println("Total Bill Cost:"+total);
    }
   

 
   
    
}

    
