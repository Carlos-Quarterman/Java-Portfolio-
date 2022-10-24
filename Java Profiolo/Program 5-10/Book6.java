//Carlos Quarterman
//4-15-14
//Program 8
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.lang.String;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;


public class Book6   
{
   static DecimalFormat twoDec = new DecimalFormat ("0.00");
   static Scanner scan = new Scanner(System.in);
   static int num;
   public static void main(String[] args)throws FileNotFoundException,  IOException
   {	       
      System.out.println("****************************************");
      System.out.println("***  The purpose of the  following   ***");
      System.out.println("***  programs are to convert their   ***");
      System.out.println("***  antiquated payroll system to a  ***");
      System.out.println("***    computer-Based model.         ***");
      System.out.println("****************************************");
      do 
      {
         System.out.println("********************************");
         System.out.println("*** 1: Display Individual    ***");
         System.out.println("*** 2: Quit                  ***");
         System.out.println("***                          ***");
         System.out.println("********************************");
         System.out.println("Please enter 1 or 2 to quit");
         num = scan.nextInt();
         
      		/* int assign;
      		 char n;
      		 n = scan.next().charAt(0);
      		 System.out.println(n);*/
         switch(num)
         {
            case 1: Display_Individual();
               break;
            case 2:System.out.println(" Have a nice day");
               break;
            default:System.out.println("Please follow direction");
         }		
      }
      			while(num != 3);
   }
   public static void Display_Individual() throws FileNotFoundException, IOException
   {
      Scanner inFile = new Scanner(new FileReader("D1
		://prog7data.txt"));
      String SSN1;
      String SSN0;                             
      String LN, FN;
      double Hours,Pay_rate, Gross_pay, Fed, State, Hosp, Union,Ded, Net_pay,Overtime;  
      
      System.out.println("Enter New SSN1");
      SSN0 = scan.next();
   
   
      while(inFile.hasNext())	
      {
         SSN1 = inFile.next();
         LN = inFile.next();
         FN = inFile.next();
         Hours = inFile.nextDouble();
         Pay_rate = inFile.nextDouble();
         
         
        
         if (SSN1.compareTo (SSN0) ==0)
         {
          
            if (Hours > 40)
            {
               Overtime = 1.5 * Hours*(Pay_rate - 40);
               Gross_pay = Overtime + (Hours * 40);
            }
            else
            {
               Overtime = 0;
               Gross_pay = Hours * Pay_rate;
            }
                     
            Fed = Gross_pay * .18;
            State = Gross_pay * .045;
            Hosp = 50.00;
            Union = 15.85;
            Ded = Fed + State + Hosp + Union;
            Net_pay = Gross_pay - Ded;
            
         
            System.out.printf("%5s%12s%12s%6.1f%9.2f%10.2f%15.2f%13.2f%10.2f%n", SSN1, LN, FN, Hours, Pay_rate, Overtime, Gross_pay, Ded, Net_pay);
         
         }
      }
      inFile.close();
      System.out.println();
      System.out.println();					
   
   
   }


   			
}


					
					
					
					
					
					
					
					
					
					
			
						

     
      	  	
    


