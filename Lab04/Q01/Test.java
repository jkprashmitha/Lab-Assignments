
package com.mycompany.prac04q01;

public class Test 
{
    public static void main(String[] args) 
    {
         Employee bodgan=new Employee();
         Employee bird=new Employee();
         
         bodgan.setempID(25);
         bodgan.setempName("Mr. Cooper");
         bodgan.setempDesignation("Director");
         
         bird.setempID(45);
         bird.setempName("Ms. Lilly");
         bird.setempDesignation("Post");
         
         System.out.println("Employee ID: "+bodgan.getempID());
         System.out.println("Employee Name: "+bodgan.getempName());
         System.out.println("Employee Designation: "+bodgan.getempDesignation());
         
         System.out.println("");
         
         System.out.println("Employee ID: "+bird.getempID());
         System.out.println("Employee Name: "+bird.getempName());
         System.out.println("Employee Designation: "+bird.getempDesignation());
    }

}
    
   
