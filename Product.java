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
public class Product {
    
    private String product_name;
    private int product_id;
    private int product_cost;
    
    public Product(String pname,int id1,int cost)
    {
        //set_name(pname);
       // set_id(id1);
        //set_cost(cost);
        this.product_name=pname;
        this.product_id=id1;
        this.product_cost=cost;
    }
    
    public void set_name(String name)
    {
        this.product_name=name;
    }
    
    public void set_id(int id1)
    {
        this.product_id=id1;
    }
    
    public void set_cost(int cost)
    {
        this.product_cost=cost;
    }
    
    public String get_product()
    {
        return product_name;
    }
    
    public int get_pid()
    {
        return product_id;
    }
    
    public int get_cost()
    {
        return product_cost;
    }
    
}
