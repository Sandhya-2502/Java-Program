import java.util.Scanner;
  
   public class Dividetwonumbers
 {
     public static void main (String[] args)
   {
     Scanner input = new Scanner(System.in);

     System.out.print("Input the firstnumber: 50");
     int a = input.nextInt();

     System.out.print("Input the second number: 2");
     int b = input.nextInt();
     
     
     int d = a/b;

     System.out.println();
     System.out.println("The division of a and b is:" +d);

    }
  }