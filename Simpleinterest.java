import java.util.Scanner;

 class Simpleinterest
 {

   public static void main(String[] args)
   {  
     float principal,rate,time,interest;


    // create an object of Scanner class
    Scanner sc = new Scanner(System.in);

    // take input from users

    System.out.print("Enter the principal: 1000");
     principal = sc.nextFloat();

    System.out.print("Enter the rate: 8");
     rate =sc.nextFloat();

    System.out.print("Enter the time: 2");
     time = sc.nextFloat();

     interest = (1000 * 8 * 2) / 100;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + interest);

    }
  
 }