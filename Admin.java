/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;
import java.util.*;

/**
 *
 * @author Vanisri Kirubakaran
 */
public class Admin implements Grocery_store {
        
   private Product product;
   private int id;
   public void set_i(int id1)
    {
        this.id=id1;
    }
   public int get_i()
    {
        return id;
    }
   
   
    
    private List<Product> Products = new ArrayList<Product>();
    
       
    public void create()
    {
        Products.add(new Product("Bread",1,30));
        Products.add(new Product ("Milk",2,23));
        Products.add(new Product("Biscuits",3,20));
    }
    
    public void show()
    {
        /*for(int i=0;i< Products.size();i++)
            System.out.println(Products.get(i));*/
        for(Product i : Products) {
          System.out.println(
                    i.get_pid() + ": " +
                            i.get_product() + " " +
                            i.get_cost() + "Rs " 
                           
            );
    }
    }
    
     public Product choose_prod(int pid) {
        
        return this.Products.get(pid-1);
        
    
    }
       
    
    
}

