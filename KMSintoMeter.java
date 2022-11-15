   import java.util.Scanner;

   
       public class KMSintoMeter
        
         {
           public static void main(String[] args)

           {

             int m= 100;

             System.out.println("Enter Kilometer:");

             double km;

             Scanner reader = new Scanner(System.in);

             km = reader.nextDouble();

             double meter = km * m;

             System.out.println("meter:"+meter);
           }
       }             