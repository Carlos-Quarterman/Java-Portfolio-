//Carlos Quarterman
//2-14-2014
//Program 4
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.*;
import java.lang.Math.*;
import java.text.DecimalFormat;
import java.lang.String;
import javax.swing.JOptionPane;


public class book22   
{
   static DecimalFormat twoDec = new DecimalFormat ("0.00");
   static Scanner scan = new Scanner(System.in);
   static int num;
   public static void main(String[] args)throws FileNotFoundException,  IOException
   {	       
      System.out.println("*****************************************");
      System.out.println("***  The purpose of the  following    ***");
      System.out.println("***  of this program is Menu Driven   ***");
      System.out.println("***  that read from a Data File and   ***");
      System.out.println("***           JOption Pane.           ***");
      System.out.println("*****************************************");
      do 
      {
         System.out.println("********************************");
         System.out.println("*** 1: Read From A Data File ***");
         System.out.println("*** 2. JOption-Pane          ***");
         System.out.println("*** 3. Quit                  ***");
         System.out.println("********************************");
         System.out.println("Please enter 1, 2, or 3 to quit");
         num = scan.nextInt();
      		/* int assign;
      		 char n;
      		 n = scan.next().charAt(0);
      		 System.out.println(n);*/
         switch(num)
         {
            case 1:Read_From_Data_File();
               break;
            case 2:JOption_Pane();
               break;
            case 3:System.out.println(" Have a nice day");
               break;
            default:System.out.println("Please follow direction");
         }		
      }
      			while(num != 4);
   }
   public static void Read_From_Data_File() throws FileNotFoundException, IOException
   {
      Scanner inFile = new Scanner(new FileReader("D:/ASU Computer Science/CSCI 1301 Intro to Computer Science I/prog4data.txt"));
      int data, child, adult;
      double adult_cost, child_cost, room_rate, tip_tax, tip_taxt, deposit, dessert, t_dessert, total_cost, total_child, total_adult, total_food, total;  
      for(int i=1;i<5;++i)	
      {
         data = inFile.nextInt();
         adult = inFile.nextInt();
         child = inFile.nextInt();
         adult_cost = inFile.nextDouble();
         dessert = inFile.nextDouble();
         room_rate = inFile.nextDouble();
         tip_tax = inFile.nextDouble();
         deposit = inFile.nextDouble();
         System.out.print(data);
         System.out.print("\t"+adult);
         System.out.print("\t"+child);
         System.out.print("\t"+adult_cost);
         System.out.print("\t"+dessert);
         System.out.print("\t"+room_rate);
         System.out.print("\t"+tip_tax);
         System.out.println("\t"+deposit);
                     
      }
      inFile.close();
   						
   }
							
   public static void JOption_Pane()
   {
                           
                              
      String name;
      String str;
      int Child = 7;
      double child_cost;
      double adult_cost = 12.75;
      double total_cost;
      double  T_Dessert;
      double total_child;
      double Deposit = 50.00;
      double dessert = 1.00;
      double total_food;
      double tip_tax = .18;
      double tip_tax2;
      double room_rate = 45.00;
      double total;
      int Adult = 23;
   
      name =
         
         JOptionPane.showInputDialog("Enter Child Count");
      System.out.println(" Caswell Catering and Convention Services ");
      System.out.println("               Final Bill                 ");
   
      System.out.println("Number of children:" +(Child));   
      JOptionPane.showInputDialog("Enter Adult Count");
      System.out.println("Number of adults:" +(Adult));
      JOptionPane.showInputDialog("Enter Adult Cost");
      System.out.println("Cost per adult without dessert:$" + twoDec.format(adult_cost));
      JOptionPane.showInputDialog("Enter Dessert Cost");
      System.out.println("Cost per dessert:$" + twoDec.format(dessert));
      JOptionPane.showInputDialog("Enter Room Rate");
      System.out.println("Room fee:$" + twoDec.format(room_rate));
      JOptionPane.showInputDialog("Enter Tip/Tax");
      System.out.println("Tip and tax rate:$" + twoDec.format(tip_tax));
      JOptionPane.showInputDialog("Enter Deposit");
      System.out.println("Less deposit:$  " + twoDec.format(Deposit));
   
   
      JOptionPane.showMessageDialog(null, "Hello World!",
                                   "Greetings",
                                JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Amount Due = $" + 439.62,
                                  "Invoice",
                                  JOptionPane.PLAIN_MESSAGE);
   
      str = "The formula for the cost per child without dessert: " + .60 + " and " + adult_cost + "\n";
      child_cost = .60 * adult_cost;
      System.out.println("Cost per child without dessert:$" + twoDec.format(child_cost));
   
   
      str = str + "The calculation is: " + child_cost  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
                                    
                                    
      str = "The formula for the total cost of adult meal: " + Adult + " and " + adult_cost + "\n";
      total_cost = Adult * adult_cost;
      System.out.println("Total cost of adult meal:$" + twoDec.format(total_cost));
   
   
      str = str + "The calculation is: " + total_cost  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
                                    
                              
       
      str = "The formula for the total cost of child meal: " + Child + " and " + child_cost + "\n";
      total_child = Child * child_cost;
      System.out.println("Total cost for child meal:$" + twoDec.format(total_child));
   
   
      str = str + "The calculation is: " + total_child  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
                                    
      str = "The formula for the total cost for dessert: " + Adult + " and Child " + dessert + "\n";
      T_Dessert = (Adult + Child) * dessert;
      System.out.println("Total cost for dessert:$" + twoDec.format(T_Dessert));
   
   
      str = str + "The calculation is: " + total_child  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
                                    
                                    
     
      str = "The formula for the total food cost: " + total_cost + " and T_Dessert " + total_child + "\n";
      total_food = total_cost + T_Dessert + total_child;
      System.out.println("Total food cost:$" + twoDec.format(total_food));
   
   
      str = str + "The calculation is: " + total_food  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
                         
                         
      str = "The formula for plus tip and tax: "  + total_food + " and " + tip_tax +  "\n";
      tip_tax2 = total_food * tip_tax;
      System.out.println("Plus tip and tax:$" + twoDec.format(tip_tax2));           
   
   
      str = str + "The calculation is: " + total_food  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
   
   
      System.out.println("Plus room fee:$" + twoDec.format(room_rate));
      System.out.println("Less deposit: $" + twoDec.format(Deposit));
   
   
   
      str = "The formula for the balance due: "  + total_food + " and " + room_rate + tip_tax2 + Deposit + "\n";
      total = (total_food + room_rate + tip_tax2) - Deposit;
      System.out.println("Balance due:$" + twoDec.format(total));
   
   
      str = str + "The calculation is: " + total_food  + "\n";
      str =  str + "That is all for now!";
   
      JOptionPane.showMessageDialog(null, str, "Summing Numbers",
                                    JOptionPane.ERROR_MESSAGE);
   
                                    
                                    
                                    
                                    
      System.exit(0);
   
   
   
                           
                           
                           
                           
   }

}
					
					
					
					
					
					
					
					
					
					
			
						

     
      	  	
    


