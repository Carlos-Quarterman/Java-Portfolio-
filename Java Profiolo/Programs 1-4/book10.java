//Carlos Quarterman
//Program Part 1a

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.lang.Math.*;
//Format the output
import java.text.DecimalFormat;
import java.lang.String;

public class book10
{
   /*Format the output---> +twoDec.format(---) */
   
   static DecimalFormat twoDec = new DecimalFormat ("0.00");
   static Scanner scan = new Scanner(System.in);
   static int num;
   public static void main(String[] args)
   {	       
      System.out.println("****************************************");
      System.out.println("***  The purpose of the  following   ***");
      System.out.println("***  programs are to calculate the   ***");
      System.out.println("***  simple interest, the   volume   ***");
      System.out.println("***  a cube, the area of a cirlce,   ***");
      System.out.println("***  and  the  volume of a cone.     ***");
      System.out.println("****************************************");
      do 
      {
         System.out.println("************************");
         System.out.println("*** 1: Display one   ***");
         System.out.println("*** 2: Display two   ***");
         System.out.println("*** 3: Display three ***");
         System.out.println("*** 4: Display four  ***");
         System.out.println("*** 5: Quit          ***");
         System.out.println("************************");
         System.out.println("Please enter 1, 2, 3, 4 or 5 to quit");
         num = scan.nextInt();
         System.out.println();
         switch(num)
         {
            case 1:simple();
               break;
            case 2: AreaCircle();
               break;
            case 3: volumecone();
               break;
            case 4: volunecube();
            case 5:System.out.println(" Have a nice day");
               break;
            default:System.out.println("Please follow direction");
         }		
      }while(num != 4);
   }
   public static void simple()
   {    
      System.out.println("****************************");
      System.out.println("*The purpose of this progam*");
      System.out.println("**   is to calculate the  **");
      System.out.println("**    Geometric Series    **");
      System.out.println("****************************");
      System.out.println("**");
   						   	
      double principal,rate,time,interest;
      principal = 100;
      rate = 0.04;
      time = 3;
   						    
      interest = principal * rate * time;
   						    
      System.out.println("The answer is ===>>>" +interest);
   						      
      System.out.println("******************************************************************************");
   		                     
   }
						
   public static void AreaCircle()
   {
      System.out.println(" Area of Circle");     						 
      System.out.println("*********************************************************");
      System.out.println("********************************");
      System.out.println("**The purpose of this program **");
      System.out.println("** is to calculate the area   **");
      System.out.println("**         of a circle        **");
      System.out.println("********************************");
      System.out.println();
      double radius,pi,area;
   
      radius = 6.2;
      pi = 3.1416;
   		
      area = pi * Math.pow(radius,2.0);
   		
      System.out.println("The answer is==>>"+twoDec.format(area));
      System.out.println("******************************************************************************");
   
   
   }
   public static void volumecone()
   {
      System.out.println(" volume of cone");
   	
      System.out.println("********************************");
      System.out.println("**The purpose of this program **");
      System.out.println("** is to calculate the volume **");
      System.out.println("**         of a cone          **");
      System.out.println("********************************");
      System.out.println();	
      double radis,b,pie,volume;
   
      radis = 9.1;
      b = 4.932747;
      pie = 3.1416;
   		
      volume = .33 * pie * Math.pow(radis,2.0)* b;
   		
      System.out.println("The answer is==>>"+twoDec.format(volume));
      System.out.println("*********************************************************");
   
      System.out.println();
   	
   }
   	
   public static void volunecube()
   {
      System.out.println("*********************************************************");
   
   
      System.out.println("********************************");
      System.out.println("**The purpose of this program **");
      System.out.println("** is to calculate the volume **");
      System.out.println("**         of a cube          **");
      System.out.println("********************************");
      System.out.println();
      double volune,cube;
   
      cube = 3.167219;
   		
      volune = Math.pow(cube,3.0);
   		
      System.out.println("The answer is==>>"+twoDec.format(volune));
   
   
   
   }


}
				
				
				
				
				
				
				
				
				
				
		
					

  
   	  	
 


