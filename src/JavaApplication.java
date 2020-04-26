/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kotacom
 */
public class JavaApplication {
       public static void main(String[] args)
   {
      Instructor myInstructor =
          new Instructor("Mahardika", "Aziz Dwi Putra", "ADPM21");

      TextBook myTextBook =
          new TextBook("Pengenalan Sitem Informasi",
                       "Andri Kristanto", "Gava Media");

      Course myCourse = 
         new Course("Information Systems", myInstructor,
                    myTextBook);

      System.out.println(myCourse);
   }
}