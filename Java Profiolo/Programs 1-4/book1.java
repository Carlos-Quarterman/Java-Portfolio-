//Carlos Quarterman
//2-11-2014
//Program 2
   import java.util.Scanner;
   import java.lang.*;
   import java.io.*;
   import java.text.*;
   import java.lang.Math.*;
   import java.text.DecimalFormat;
   import java.lang.String;

    public class book1  
   {
      static Scanner scan = new Scanner(System.in);
      static DecimalFormat twoDec = new DecimalFormat ("0.00");
       public static void main(String[] args)
      {	
      
         System.out.println("*********************************");
         System.out.println("** The purpose of this program **");
         System.out.println("**  is to calculate amount a   **");	
         System.out.println("**    customer should be       **");
         System.out.println("**         charged             **");
			System.out.println("*********************************");
      
      
      
         int Sqyd;
         double Cost = 18.50; 
         double labor_sqyd = 3.50; 
         double prep_cost = 38.50; 
         double Discount= 0.02; 
         double Carpet_charge = 314.50; 
         double labor_cost = 98.00; 
         double Dis_Carpet = 6.29; 
         double tax = 12.58; 
         double totalPrice; 
         
         System.out.println("---------------------------------------------------------");
         System.out.println("Customer  Sq.   Cost per    Labor per   Prep     Discount");
         System.out.println("          yds.  sq. yd      sq. yd.     Cost ");
         System.out.println("---------------------------------------------------------");
         System.out.println("    1      17   18.50        3.50       38.50      0.02");
         System.out.println("    2      40   24.95        2.95        0.00      0.14");
         System.out.println("    3      23   16.80        3.25       57.95      0.00");
         System.out.println("    4      26   21.25        0.00       80.00      0.00");
         System.out.println("---------------------------------------------------------");
         System.out.println("---------------------------------------------------------");

         
         System.out.println("Enter Sqyds Purchased");
         Sqyd = scan.nextInt();
         Carpet_charge = Sqyd * Cost;
         System.out.println("Enter Cost");
         labor_cost = scan.nextDouble();
         labor_cost = Sqyd * labor_sqyd + prep_cost;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
         System.out.println("Enter Labor Sqyd");
         Dis_Carpet = scan.nextDouble();
         Dis_Carpet = Carpet_charge * Discount;
         System.out.println("Enter Prep Cost");
         tax = scan.nextDouble();
         tax = Carpet_charge * .04;
         System.out.println("Enter Discount");
         totalPrice = scan.nextDouble();
         totalPrice = Carpet_charge + labor_cost + tax - Dis_Carpet;
         System.out.println("Square yards purchased:     " +    Sqyd);
         System.out.println(" Cost per squared yard:  $  " + twoDec.format(Cost));
         System.out.println("Labor per squared yard:  $  " + twoDec.format(labor_sqyd));
         System.out.println("Floor preparation cost:  $  " + twoDec.format(prep_cost));
         System.out.println("       Cost for carpet:  $  " + twoDec.format(Carpet_charge));
         System.out.println("        Cost for labor:  $  " + twoDec.format(labor_cost));
         System.out.println("    Discount on carpet:  $  " + twoDec.format(Dis_Carpet));
         System.out.println("         Tax on carpet:  $  " + twoDec.format(tax));
         System.out.println("    Charge to customer:  $  " + twoDec.format(totalPrice));  	
      	
      }
}
