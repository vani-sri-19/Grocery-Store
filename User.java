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
public class User {
    
     private String first_name;
    private String last_name;
    private int user_id;
    
    public User(String fn,String ln,int id)
    {
       // setfirst_name(fn);
        this.first_name=fn;
        this.last_name=ln;
        this.user_id=id;
       // setlast_name(ln);
       // setid(id);
       
    }
    
    public void setfirst_name(String fn)
    {
        this.first_name=fn;
    }
    
    public void setlast_name(String ln)
    {
        this.last_name=ln;
    }
    
    public void setid(int id)
    {
        this.user_id=id;
    }
    
   public String getfirst_name()
   {
       return first_name;
   }
   
   public String getlast_name()
   {
       return last_name;
   }
   
   public int getid()
   {
       return user_id;
   }
    
   
    
}
