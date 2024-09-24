import java.util.Scanner;

public class IT24101092Lab7Q3 {
       public static void main(String[] args) {

       Scanner ds = new Scanner(System.in);

       double discount;      
       double p_amount;
       char mode;

       System.out.print("Enter total bill amount : ");
       int amount = ds.nextInt();
   
       System.out.print("Enter mode of payement (C for cash, O for other) : ");
       mode = ds.next().charAt(0);
    
       switch (mode)
       {
       case 'C' : discount = amount*5/100;
                  p_amount = amount - discount;
                  System.out.println("Discount is : " +discount);
                  System.out.println("Amount to be paid : " +p_amount);
                  break;
      
       case 'c' : discount = amount*5/100;
                  p_amount = amount - discount;
                  System.out.println("Discount is : " +discount);
                  System.out.println("Amount to be paid : " +p_amount);
                  break;

       case 'O' : System.out.println("No discount applicable");
                  System.out.println("Amount to be paid : " +(double)amount);
                  break;
       
       case 'o' :System.out.println("No discount applicable");
                 System.out.println("Amount to be paid : " +(double)amount);
                 break;
       
       default : System.out.println("Payement Mode is Not Valid");
       }
     }
   }
        