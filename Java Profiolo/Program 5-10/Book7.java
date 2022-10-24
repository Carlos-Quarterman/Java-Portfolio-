//Carlos Quarterman
//4-24-2014
//Program 9
   import java.util.*;
   import java.lang.*;
   import java.io.*;
   import java.text.*;
   import java.lang.String;
   import javax.swing.JOptionPane;
   import java.math.*;
   import java.util.Scanner;
   import java.text.DecimalFormat;

    public class Book7
   {
      static DecimalFormat td = new DecimalFormat ("0.00");
      static Scanner scan = new Scanner(System.in);
   
       public static void main(String []args)
      {
         int num;
         do
         {
            System.out.println("****************************************");
            System.out.println("**  1. Calculate Monthly Payment.      *");
            System.out.println("**  2. Print information.              *");
            System.out.println("**  3. Print Amortization Table.       *");
            System.out.println("**  4. Quit                            *");
            System.out.println("****************************************");
            System.out.println("** Please enter 1, 2, 3, or 4 to quit  *");
            System.out.println();
            Scanner console= new Scanner(System.in);
            num = console.nextInt();
            switch (num)
            {
               case 1: CalculateMonthlyPayment();
                  break;
               case 2: PrintInformation();
                  break;
               case 3: PrintAmortizationTable();
                  break;
               default: System.out.println("Please follow directions, only 1, 2, 3, and 4 to quit.");
            }
         }while(num !=4);
      }
       public static void CalculateMonthlyPayment()
      {
         int M, Y;
         double NM, IM, P, Q, NY, IY, IR, PR, OB, MP;
         Scanner console= new Scanner(System.in);
      
         System.out.print("Enter loan amount (principal): ");
         PR= console.nextDouble();
         System.out.println();
      
         System.out.print("Enter scheduled number of years to amortize the loan: ");
         IY = console.nextDouble();
         System.out.println();
      
         System.out.print("Enter the number of years: ");
         NY = scan.nextInt();
         System.out.println();
      
         NM = (NY * 12);
         IM = (IY/12) / 100;
         P = Math.pow(1 + IM, NM);
         Q = (P/(P-1));
         MP = (PR*IM*Q);
         System.out.printf("Monthly Payment is $" + "%3.2f%n", MP);
         System.out.println();
      }
       public static void PrintInformation()
      {
         int M, NY;
         double NM, IM, P, Q, IY, IR, PR, MP, IP, PPd, NB, OB, sum;
         Scanner console = new Scanner(System.in);
      
         IP=0;
         PPd=0;
         NB=0;
         OB=0;
         sum=0;
      
         System.out.print("Enter loan amount (principal): ");
         PR= console.nextDouble();
         OB=PR;
         System.out.print("Interest per year (percent): ");
         IY= console.nextDouble();
         System.out.print("Number of years: ");
         NY= console.nextInt();
         System.out.println();
      
         NM = (NY * 12);
         IM = (IY/12) / 100;
         P = Math.pow(1 + IM, NM);
         Q = (P/(P-1));
         MP = (PR*IM*Q);
      
         IP= OB* IM;
         PPd= MP-IP;
         NB= OB-PPd;
         OB=NB;
         sum= sum + IP;
      
      
         System.out.printf("The amount of the loan (principal): $" + "%5.2f%n", PR);
         System.out.printf("Interest rate per year (percent):    " + "%9s%n", IY);
         System.out.printf("Interst rate per month (decimal):   " + "%1.6f%n", IM);
         System.out.printf("Number of years: " + "%9s%n", NY);
         System.out.printf("Number of months: " + "%9s%n", NM);
         System.out.printf("Monthly payment: $" + "%3.2f%n", MP);
         System.out.println();
      }
       public static void PrintAmortizationTable()
      {
         int M, Y;
         double NM, IM, P, Q, NY, IY, IR, PR, MP, IP, PPd, NB, OB, sum;
         Scanner console = new Scanner(System.in);
      
         IP=0;
         PPd=0;
         NB=0;
         OB=0;
         sum=0;
      
         System.out.print("Enter loan amount (principal): ");
         PR= console.nextDouble();
         OB=PR;
         System.out.print("Interest per year (percent): ");
         IY= console.nextDouble();
         System.out.print("Number of years: ");
         NY= console.nextInt();
         System.out.println("************************************************************************");
      
      
         System.out.println("*             Old      Monthly    Interest Prinicipal      New      *");
         System.out.println("* Month     Balance    Payment      Paid      Paid       Balance    *");
         System.out.println("*************************************************************************");
         for (M=1; M<=12; M++)
         {
            NM = (NY * 12);
            IM = (IY/12) / 100;
            P = Math.pow(1 + IM, NM);
            Q = (P/(P-1));
            MP = (PR*IM*Q);
         
            IP= OB* IM;
            PPd= MP-IP;
            NB= OB-PPd;
            System.out.printf("%2s%4s%1s%-5s%6.2f%-5s%6.2f%-5s%6.2f%-5s%6.2f%-5s%6.2f%n", " ", M, ".", " ", OB, " ", MP, " ", IP, " ", PPd, " ", NB, " ");
            OB= NB;
            sum=sum +IP;
            System.out.println();
         }
         System.out.printf("Total amount paid: $%4.2f%n", (PR + sum));
         System.out.println();
      
      }
   }
