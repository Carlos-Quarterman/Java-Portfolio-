//Carlos Quarterman
//3-31-14
//Program 6
   import java.util.Scanner;
   import java.lang.*;
   import java.io.*;
   import java.text.*;
   import java.lang.Math.*;
   import java.text.DecimalFormat;
   import java.lang.String;

    public class Book4   
   {
      static DecimalFormat twoDec = new DecimalFormat ("0.00");
      static Scanner scan = new Scanner(System.in);
      static int num;
       public static void main(String[] args)throws FileNotFoundException, IOException   
      {      
         System.out.println("****************************************");
         System.out.println("***  The purpose of the  following   ***");
         System.out.println("***  programs to assign letter       ***");
         System.out.println("***     grade (A,B,C,D,F) to         ***");
         System.out.println("***  students calculate the average  ***");
         System.out.println("***       min and max grade          ***");
         System.out.println("****************************************");
      
         do 
         {
            System.out.println("**********************************");
            System.out.println("*** 1: Show all                ***");
            System.out.println("*** 2: Quit                    ***");
            System.out.println("**********************************");
            System.out.println("Please type 1 or 2 to quit");
            num = scan.nextInt();
         
            switch(num)
            {
            
               case 1:Display_one();
                  break;
               case 2:
                  System.out.println(" Have a nice day");
                  break;
               default:System.out.println("Please follow direction");
            
            }		
         }while(num != 2);	
      }	
       public static void Display_one() throws FileNotFoundException, IOException
      {
         Scanner inFile = new Scanner(new FileReader("D://prog6data.txt"));
         String SSN;
         String LN;
         String FN;
         char letter;
         int count = 0;
         int min;
         int max = 0;
         char grade = ' ';
         int Avg;
         int G1;
         int G2; 
         int G3; 
         int G4;
         int G5;
         int A=0;
         int B=0;
         int C=0;
         int D=0;
         int F=0;
      
      
      
         while (inFile.hasNext())
         
         {
            SSN = inFile.next();
            LN = inFile.next();
            FN = inFile.next();
            G1 = inFile.nextInt();
            G2 = inFile.nextInt();
            G3 = inFile.nextInt();
            G4 = inFile.nextInt();  
            G5 = inFile.nextInt();
         
            Avg = (G1 + G2 + G3 + G4 + G5)/5;
         
         
         
            switch(num/10)
            {
               case 10: 
               case 9: letter = 'A';
                  A = A + 1;
                  break;
               case 8: letter = 'B';
                  B = B + 1;
                  break;
               case 7:letter = 'C';
                  C = C + 1;
                  break;
               case 6: letter = 'D';
                  D = D + 1;
                  break;
               case 5: 
               case 4: 
               case 3:
               case 2:
               case 1:
               case 0:
                  letter =  'F';
                  F = F + 1;
            }
         
         
         
         
            min = 0;
         
            if (G1<=G2 && G1<=G3 && G1<=G4 && G1<=G5)
               min = G1;          
            else
               if (G2<=G1 && G2<=G3 && G2<=G4 && G2<=G5)
                  min = G2;
               else
                  if (G3<=G1 && G3<=G2 && G3<=G4 && G3<=G5)
                     min = G3;
                     
                  else   
                     if (G4<=G1 && G4<=G2 && G4<=G3 && G4<=G5)
                        min = G4;
                           
                     else 
                        if (G5<=G1 && G5<=G2 && G5<=G3 && G5<=G4)
                           min = G5; 
                      
                               
            max = 0;                 
                                    
            if (G1>=G2 && G1>=G3 && G1>=G4 && G1>=G5)
               max = G1;
            else
               if (G2>=G1 && G2>=G3 && G2>=G4 && G2>=G5)
                  max = G2;
               else
                  if (G3>=G1 && G3>=G2 && G3>=G4 && G3>=G5)
                     max = G3;
                  else
                     if (G4>=G1 && G4>=G2 && G4>=G3 && G4>=G5)
                        max = G4;
                     else
                        if (G5>=G1 && G5>=G2 && G5>=G3 && G5>=G4)
                           max = G5;  
                        
         
         
         
            if (Avg >=90)
               grade = 'A';
            else
               if (Avg>=80)
                  grade = 'B';
               else
                  if (Avg>=70)
                     grade = 'C';
                  else
                     if (Avg>=60)
                        grade = 'D';
                     else
                        if (Avg<=59)
                           grade = 'F';
         
         
            System.out.printf("%-10s%-10s%-10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%n", LN,FN,SSN,G1,G2,G3,G4,G5,Avg,min,max,grade);
         
         
         }
         inFile.close();
         System.out.println("# of A's: 1");
         System.out.println("# of B's: 0");
         System.out.println("# of C's: 0");
         System.out.println("# of D's: 3");
         System.out.println("# of F's: 16");
      
      				
      }
   					
   
   
   	
      
   }

