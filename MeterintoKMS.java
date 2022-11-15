import java.util.Scanner;
   
       public class MeterintoKMS
       
       {
           public static void main(String []args)
      
          {
             Scanner in = new Scanner(System.in);

             System.out.println("Enter the length to convert Meter into Kilometer");
     
             double m = in.nextDouble();
       
             double kilometer = m/1000;

             System.out.println(m + "meter is equal to" + kilometer + "kilometer");

            }
        }