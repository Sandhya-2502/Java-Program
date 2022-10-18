import java.util.Scanner;
  
   public class Productnumbers
 {
 
      public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Enter first number:6");
      
      int a = sc.nextInt();

     System.out.println("Enter second number:4");

      int b = sc.nextInt();

     System.out.println("Enter the third number:5");

      int c = sc.nextInt();
   
      int result = a*b*c;
  
    System.out.println("Product of given three numbers is:"+result);
   
    }
 }
