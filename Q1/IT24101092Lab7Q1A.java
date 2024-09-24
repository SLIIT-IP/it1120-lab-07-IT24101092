import java.util.Scanner;

public class IT24101092Lab7Q1A {
       public static void main(String[] args) {

       Scanner av = new Scanner(System.in);

       int count = 1;
       double total = 0;

       while(count <= 4)
       {
       System.out.print("Enter Subject Mark" + count + " : ");
       int mark = av.nextInt();
       total = total + mark ;
       count++;
       } 
      
       double average = total/4;
       System.out.println("Average  is : " + average);

       if(average >= 75) {
        System.out.println("Overall Grade is : Distinction");  
       }
    
       else if (average >= 50 && average <= 74) {
        System.out.println("Overall Grade is : Credit");       
       } 

       else{
        System.out.println("Overall Grade is : Fail");   
       }
      
     } 
   }  
