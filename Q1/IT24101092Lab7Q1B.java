import java.util.Scanner;

public class IT24101092Lab7Q1B {
       public static void main(String[] args) {

       Scanner av = new Scanner(System.in);
       
       int mark1 = 0, mark2 = 0, mark3 = 0, mark4 = 0;
       int count;
       int student;

       for(student = 1; student <= 3; student++)
       {
       System.out.println("Student "+student);

       for(count = 1; count <= 1; count++)
       {
       System.out.println("Enter Subject Marks : ");
       mark1 = av.nextInt();
       mark2 = av.nextInt();
       mark3 = av.nextInt();
       mark4 = av.nextInt();
       } 
      
       double average = (mark1 + mark2 + mark3 + mark4)/4;
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
       System.out.println();
       }
      
     } 
   }  
