//Carlos Quarterman
//2-19-2014
//Program 3
   import java.util.Scanner;
   import java.lang.*;
   import java.io.*;
   import java.text.*;
   import java.lang.Math.*;
   import java.text.DecimalFormat;
   import java.lang.String;

    public class book2 
   {
      static DecimalFormat twoDec = new DecimalFormat ("0.00");
      static Scanner scan = new Scanner(System.in);
      static int num;
       public static void main(String[] args)throws FileNotFoundException, IOException
      {	       
         System.out.println("******************************");
         System.out.println("***  The purpose of this   ***");
         System.out.println("***   program to produce   ***");
         System.out.println("***    customer's bills    ***");
         System.out.println("******************************");
      
         System.out.println("-------------------------------------------------");
         System.out.println("     Child Adult Adult Dessert Room  Tip/        ");
         System.out.println("Data Count Count Cost  Cost    Rate  Tax  Deposit");
         System.out.println("-------------------------------------------------");
         System.out.println("1    7     23    12.75 1.00    45.00 18%  50.00  ");
         System.out.println("2    3     54    13.50 1.25    65.00 19%  40.00  ");
         System.out.println("3    15    24    12.00 0.00    45.00 18%  75.00  ");
         System.out.println("4    2     71    11.15 1.50     0.00  6%   0.00  ");
         System.out.println("-------------------------------------------------");   
      
      
         do 
         {
            System.out.println("************************");
            System.out.println("*** 1: Display One   ***");
            System.out.println("*** 2. Display Two   ***");
            System.out.println("*** 3. Display Three ***");
            System.out.println("*** 4: Quit          ***");
            System.out.println("***                  ***");
            System.out.println("************************");
            System.out.println("Please enter 1, 2, 3 or 4 to quit");
            num = scan.nextInt();
         	/* int assign;
         	 char n;
         	 n = scan.next().charAt(0);
         	 System.out.println(n);*/
            switch(num)
            {
               case 1:Display_one();
                  break;
               case 2:Display_two();
                  break;
               case 3:Display_three();
                  break;
               case 4:System.out.println(" Have a nice day");
                  break;
               default:System.out.println("Please follow direction");
            }		
         }
         		while(num != 4);
      }
       public static void Display_one() throws FileNotFoundException, IOException
      {
      
         Scanner inFile = new Scanner(new FileReader("E:/ASU Computer Science/CSCI 1301 Intro to Computer Science I/prog4data.txt"));
         int data;
         int Child;
         int Adult;
         double adult_cost;
         double child_cost;
         double room_rate;
         double tip_tax;
         double tip_tax2;
         double Deposit;
         double dessert;
         double T_Dessert;
         double total_cost;
         double total_child; 
         double total_adult; 
         double total_food;
         double total;  
         
         for(int i=1;i<5;++i)	
         {
            data = inFile.nextInt();
            Adult = inFile.nextInt();
            Child = inFile.nextInt();
            adult_cost = inFile.nextDouble();
            dessert = inFile.nextDouble();
            room_rate = inFile.nextDouble();
            tip_tax = inFile.nextDouble();
            Deposit = inFile.nextDouble();
            System.out.print(data);
            System.out.print("\t"+Adult);
            System.out.print("\t"+Child);
            System.out.print("\t"+adult_cost);
            System.out.print("\t"+dessert);
            System.out.print("\t"+room_rate);
            System.out.print("\t"+tip_tax);
            System.out.println("\t"+Deposit);
         }
         inFile.close();
      					
      }
   						
       public static void Display_two()throws FileNotFoundException, IOException
      {
      
         Scanner inFile = new Scanner(new FileReader("E:/ASU Computer Science/CSCI 1301 Intro to Computer Science I/prog4data.txt"));
         int data;
         int Child;
         int Adult;
         double adult_cost, child_cost, room_rate, tip_tax, tip_tax2, Deposit, dessert, T_Dessert, total_cost, total_child, total_Adult, total_food, total;  
         for(int i=1;i<5;++i)	
         {
            data = inFile.nextInt();
            Adult = inFile.nextInt();
            Child = inFile.nextInt();
            adult_cost = inFile.nextDouble();
            dessert = inFile.nextDouble();
            room_rate = inFile.nextDouble();
            tip_tax = inFile.nextDouble();
            Deposit = inFile.nextDouble();
            System.out.print(data);
            System.out.print("\t"+Adult);
            System.out.print("\t"+Child);
            System.out.print("\t"+adult_cost);
            System.out.print("\t"+dessert);
            System.out.print("\t"+room_rate);
            System.out.print("\t"+tip_tax);
            System.out.println("\t"+Deposit);
         }
         inFile.close();
      
      
      }
       public static void Display_three()throws FileNotFoundException, IOException
      {
      
         Scanner inFile = new Scanner(new FileReader("E:/ASU Computer Science/CSCI 1301 Intro to Computer Science I/prog4data.txt"));
         int data;                                   
         int Child;
         int Adult;
         double adult_cost, child_cost, room_rate, tip_tax, tip_tax2, Deposit, dessert, T_Dessert, total_cost, total_child, total_Adult, total_food, total;  
         for(int i=1;i<5;++i)	
         {
            data = inFile.nextInt();
            Adult = inFile.nextInt();
            Child = inFile.nextInt();
            adult_cost = inFile.nextDouble();
            dessert = inFile.nextDouble();
            room_rate = inFile.nextDouble();
            tip_tax = inFile.nextDouble();
            Deposit = inFile.nextDouble();
            System.out.print(data);
            System.out.print("\t"+Adult);
            System.out.print("\t"+Child);
            System.out.print("\t"+adult_cost);
            System.out.print("\t"+dessert);
            System.out.print("\t"+room_rate);
            System.out.print("\t"+tip_tax);
            System.out.println("\t"+Deposit);
         }
         inFile.close();
      
      
      
      
                          
      }
   
   
   }
					
					
					
					
					
					
					
					
					
					
			
						

     
      	  	
    


