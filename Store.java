/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package store;

  
import java.util.Scanner;
//import static store.Bill.total_cost;


/**
 *
 * @author Vanisri Kirubakaran
 */
public class Store {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String first_name,last_name;
        int user_id=1,choice=0,qty=0;
        String ans1;
        char c1;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first name and last name");
        first_name=input.nextLine();
        last_name=input.nextLine();
        
        
        
        User obj = new User(first_name,last_name,user_id);
        Admin admin = new Admin();
        admin.create();
        System.out.println("Available products-");
        admin.show();
       
       do 
        {
                   
            System.out.println("Enter your choice id");
            choice=input.nextInt();
            
            System.out.println("Enter quantity");
            qty=input.nextInt();
            if(qty>5)
            {
               System.out.println("not available");
                
            }
            else if(qty==5)
            {
                admin.delete(choice); 
            }
             
            Bill b = new Bill();
            b.bi(obj,admin.choose_prod(choice),qty);
            b.display_bill();
              
              System.out.println("Do you want to buy more?(yes/no)");
                 ans1=input.next();
                 c1=ans1.charAt(0);   
                
        }while(c1=='y'); 
       
              
       Bill bill_obj = new Bill();
       bill_obj.total_cost();
     
       System.out.println("Are you registered customer?");
   String ans=input.next();
   char c=ans.charAt(0);
   if(c=='y')
   {
      Bill poly1 = new Calc_discount();
       poly1.total_cost();
      
   }
   else
   {
       Bill poly2 = new Not_member();
       poly2.total_cost();
     
   }
       
      
                
        
        
    }
    
}
/* switch(choice)
                {
                    case 1:Product o1 = new Product("Bread",1,30);
                            if(qty<5){
                              Bill b1 = new Bill();
                              b1.bi(obj, o1, qty);
                              b1.display_bill();  
                            }
                            else
                                System.out.println("not available");
                           break;
                    case 2:Product o2 = new Product("Milk",2,23);
                            if(qty<3){
                               Bill b2 = new Bill(); 
                               b2.bi(obj,o2,qty);
                               b2.display_bill();  
                            }
                            else
                                System.out.println("not available");                         
                            break;
                    case 3:Product o3 = new Product("Biscuits",3,20);
                            if(qty<5){
                               Bill b3 = new Bill(); 
                               b3.bi(obj, o3, qty);
                               b3.display_bill(); 
                            }
                            else
                                System.out.println("not available"); 
                            break;
                            
                }*/
    

