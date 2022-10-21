import java.util.Scanner;

  class Compoundinterest
  {

    public static void main(String[] args)
    {

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the principal: 1000");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: 10");
    double rate = input.nextDouble();

    System.out.print("Enter the time: 3");
    double time = input.nextDouble();

    System.out.print("Enter number of times interest is compounded: 1");
    int number = input.nextInt();
   
   
    compound interest = (1000 * (Math pow((1+10 / 100)),(3 * 1))) - 1000;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);

   input.close();
  }
 }
