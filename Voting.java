  import java.util.Scanner;

    public class Voting
    
    {
      public static void main(String [] args)
      
      {


          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Your Name : ");
  
          String name = sc.nextLine();

          System.out.println("Enter Your age ; ");

          int age = sc.nextInt();

          if ((age>=18) && (age>=100))

      {
          System.out.println("Sorry "+ name +", You are not eligible for Voting");
    
       }

         else 

        {
          System.out.println("Congratulation "+ name +", You are eligible for Voting");

         }
      }
    }
       