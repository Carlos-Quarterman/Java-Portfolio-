//Carlos Quaterman
//Program Part 1b
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.lang.String;

public class Book_1 
{
   static DecimalFormat twoDec = new DecimalFormat ("0.00");
   public static void main(String[] args)
   {     	
      System.out.println("********************************");
      System.out.println("**The purpose of this program **");
      System.out.println("** is to calculate the simple **");
      System.out.println("**         interest           **");
      System.out.println("********************************");
      System.out.println();
      double principal,time,interest,rate;
    
      principal = 100;
      rate = 0.04;
      time = 3;
   			
      interest= principal * rate * time;
   			
      System.out.println("The answer is==>>"+interest);
      
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
   
      System.out.println("*********************************************************");
   
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

