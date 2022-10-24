//Carlos Quarterman
//3-17-2014
//Program 5
   import java.util.Scanner;
   import java.lang.*;
   import java.io.*;
   import java.text.*;
   import java.lang.Math.*;
   import java.text.DecimalFormat;
   import java.lang.String;



    public class Book3 
   {
      static DecimalFormat twoDec = new DecimalFormat ("0.00");
      static Scanner scan = new Scanner(System.in);
       public static void main(String[] args)
      {	       
         System.out.println("*****************************************");
         System.out.println("*** The purpose of this program       ***");
         System.out.println("*** is to print a monthly sales       ***");
         System.out.println("***           chart.                  ***");
         System.out.println("*****************************************");
      
         String State1;
         int Basic1 = 150;
         int Child1 = 120;
         int Update1 = 105;
         String State2;
         int Basic2 = 225;
         int Child2 = 200;
         int Update2 = 150;
         int TotalUnitSold;
         int TotalUnitSold2;
         int TotalUnitSold3; 
         double PriceUnit = 325.00;
         double PriceUnit2 = 127.50;
         double PriceUnit3 = 18.95;
         double CommissionPaid;
         double CommissionPaid2;
         double CommissionPaid3;
         double GrossSales;
         double GrossSales2;
         double GrossSales3;
         double CommissionRate = 0.22;
         double CommissionRate2 = 0.15;
         double CommissionRate3 = 0.20;
      
      
         System.out.println("What is your sales region?");
         State1 = scan.next();
         System.out.println("How many Basic Encyclopedia were sold?");
         Basic1 = scan.nextInt();
         System.out.println("How manny Child Supplements were sold?");
         Child1 = scan.nextInt();
         System.out.println("How many Annual Updates were sold?");
         Update1 = scan.nextInt();
      
      
      
         System.out.println("What is your sales region?");
         State2 = scan.next();
         System.out.println("How many Basic Encyclopedia were sold?");
         Basic2 = scan.nextInt();
         System.out.println("How manny Child Supplements were sold?");
         Child2 = scan.nextInt();
         System.out.println("How many Annual Updates were sold?");
         Update2 = scan.nextInt();
      
      
         TotalUnitSold = Basic1 + Basic2;
         GrossSales = TotalUnitSold * PriceUnit;
         CommissionPaid = GrossSales * CommissionRate;
      
         TotalUnitSold2 = Child1 + Child2;
         GrossSales2 = TotalUnitSold2 * PriceUnit2;
         CommissionPaid2 = GrossSales2 * CommissionRate2;
      
         TotalUnitSold3 = Update1 + Update2;
         GrossSales3 = TotalUnitSold3 * PriceUnit3;
         CommissionPaid3 = GrossSales3 * CommissionRate3;
      
       
         System.out.println("                                                      Monthly Sales Chart");
         System.out.println("");
         System.out.println(" 							    Basic           Child	 Annual");
         System.out.println("	                    Region		        Encyclopedia      Supplement     Update                    ");
         System.out.println("");
         System.out.println("Units sold                    " +State1  +  "                             "+Basic1 + "             "+Child1 +  "          "+Update1);
         System.out.println("(by region)                   " +State2  +  "                             "+Basic2 + "             "+Child2 +  "          "+Update2);
         System.out.println("	         		                   	     ---             ---          ---");
         System.out.println("Total units sold:                                            "  										 +TotalUnitSold  + "             " +TotalUnitSold2 + "          " +TotalUnitSold3													);
         System.out.println("");
         System.out.println("Price/Unit:                                                 $"      +twoDec.format(PriceUnit)      + "         $" +twoDec.format(PriceUnit2)  + "      $"      +twoDec.format(PriceUnit3)); 	
         System.out.println("Gross Sales:                                             $"       +twoDec.format(GrossSales)     + "       $" +twoDec.format(GrossSales2) + "  $" +twoDec.format(GrossSales3));
         System.out.println("");
         System.out.println("Commission rate:                                               "   +CommissionRate  + "            " +CommissionRate2 + "        " +twoDec.format(CommissionRate3));
         System.out.println("");
         System.out.println("Commissions Paid:                                         $"     +twoDec.format(CommissionPaid)  + "        $" +twoDec.format(CommissionPaid2) + "     $"  +twoDec.format(CommissionPaid3));
               
      
      
      
      
      
      
      
      
      
      
      }
   }