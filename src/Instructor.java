/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kotacom
 */
public class Instructor {
    private String lastName,        
                  firstName,    
                  officeNumber; 

   public Instructor(String lname, String fname,
                     String office){
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   }
   public void set(String lname, String fname,
                   String office){
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   }
   
   public String toString()
   {
      String str = "Last Name: " + lastName
                   + "\nFirst Name: " + firstName
                   + "\nOffice Number: " + officeNumber;
      return str;
   }
}
