import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.lang.String;

public class Book8p   
{
   static DecimalFormat twoDec = new DecimalFormat ("0.00");
   static Scanner scan = new Scanner(System.in);
   //static int num;
   public static void main(String[] args)
   {	       
      System.out.println("****************************************");
      System.out.println("***  The purpose of the  following   ***");
      System.out.println("***  programs are to calculate the   ***");
      System.out.println("***  simple interest, the   volume   ***");
      System.out.println("*** of a cube, the area of a cirlce, ***");
      System.out.println("***  and  the  volume of a   cone.   ***");
      System.out.println("****************************************");
      char operation;
      getRomanNumeral();
   
         
      do 
      {
         System.out.println("************************");
         System.out.println("*** 1: + Add         ***");
         System.out.println("*** 2. - Subtract    ***");
         System.out.println("*** 3. * Multiply    ***");
         System.out.println("*** 4: / Divide      ***");
         System.out.println("***                  ***");
         System.out.println("************************");
         System.out.println("Please enter 1, 2, 3, 4 or 5 to quit");
         operation= scan.next().charAt(0);
      
         switch (operation)
         {
            case '+': add();
               break;
            case '-': subtract();
               break;
            case '*': multiply();
               break;
            case '/': divide();
               break;
            default:System.out.println("Please follow direction");
         
         }
      }
         while (operation !='5');
   }
   public static void getRomanNumeral()
   {
      int num1,num2;
      String roman;
      String roman1; 
      String roman2;
      String rNum1, rNum2 = " ";
      
      System.out.print("Enter the first Roman Numeral: ");
      roman1= scan.next();
      roman1= roman1.toUpperCase();
      
      num1= romanToNum(roman1);
      rNum1= numToRoman(num1);
      
      System.out.println("The first roman numeral is " + rNum1 + " (" + num1 + ")");
      System.out.println();
      
      System.out.print("Enter the second Roman Numeral: ");
      roman2= scan.next();
      roman2= roman2.toUpperCase();
      
      num2= romanToNum(roman2);
      rNum2= numToRoman(num2);
      
      System.out.println("The second roman numeral is " + rNum2 + " (" + num2 + ")");
      System.out.println();
   }
   public static void add()
   {
      int num1, num2, sum;
      String roman;
      String roman1;
      String roman2;
      num1 = romanToNum(roman1);
      num2 = romanToNum(roman2);
      
      sum = num1+num2;
      roman= numToRoman(sum);
      
      System.out.println("\n The sum of " +roman1 + " and " +roman2+ " is " +roman + " (" +sum + ")\n");
   }
   public static void subtract()
   {
      int num1,num2,diff;
      String roman, roman1,roman2;
      num1= romanToNum(roman1);
      num2= romanToNum(roman2);
      diff= num1-num2;
      roman= numToRoman(diff);
      
      System.out.println("\nThe difference of " + roman1 + " and " + roman2 + " is " + roman + " (" + diff + ")\n");
   }
   public static void multiply()
   {
      int num1, num2, product;
      String roman,roman1,roman2;
      num1= romanToNum(roman1);
      num2= romanToNum(roman2);
      product= num1*num2;
      roman= numToRoman(product);
      
      System.out.println("\nThe product of " + roman1 + " and " + roman2 + " is " + roman + " (" + product + ")\n");
   }
   public static void divide()
   {
      int num1, num2, quotient;
      String roman;
      String roman1;
      String roman2;
      num1= romanToNum(roman1);
      num2= romanToNum(roman2);
      
      if(num1>num2)
         quotient= num1/num2;
      else
         quotient= num2/num1;
      
      roman= numToRoman(quotient);
      
      System.out.println("\nThe quotient of " + roman1 + " and " + roman2 + " is " + roman + " (" + quotient + ")\n");
   }
   public static int romanToNum(String roman)
   {
      int num=0;
      roman=roman.toUpperCase();
      for(int i =0; i<roman.length(); i++)
      {
         if(roman.charAt(i) == 'M')
            num=num+1000;
         else if(roman.charAt(i) == 'D')
            num=num+500;
         else if(roman.charAt(i) == 'C')
            num=num+100;
         else if(roman.charAt(i) == 'L')
            num=num+50;
         else if(roman.charAt(i) == 'X')
            num=num+10;
         else if(roman.charAt(i) == 'V')
            num=num+5;
         else
            num=num+1;
      }
      return num;
   }
   public static String numToRoman(int num)
   {
      int temp=0;
      String finalRoman= " ";
      if(num >= 1000)
      {
         temp=num/1000;
         num=num%1000;
         for (int i=1; i<=temp; i++)
            finalRoman+= 'D';
      }
      if(num>=100)
      {
         temp=num/100;
         num=num%100;
         for (int i=1; i<=temp; i++)
            finalRoman+= 'C';
      }
      if(num>=50)
      {
         temp=num/50;
         num=num%50;
         for (int i=1; i<=temp; i++)
            finalRoman+= 'L';
      }
      if(num>=10)
      {
         temp=num/10;
         num=num%10;
         for (int i=1; i<=temp; i++)
            finalRoman+= 'X';
      }
      if (num>=5)
      {
         temp=num/5;
         num=num%5;
         for(int i=1; i<=temp; i++)
            finalRoman += 'V';
      }
      for (int i=1; i<=num; i++)
         finalRoman += 'I';
      return finalRoman;
      
   }
}

