import java.util.Scanner;

    public class Speedistancetime
  
  {
   public static void main (String [] args)
    
   {
   
     Scanner in = new Scanner(System.in);
    
     System.out.print("please enter speed : ");

     int speed  = in.nextInt();

     System.out.print("please enter distance : ");

     int distance  = in.nextInt();

     float time = (float)distance / speed;

     System.out.println("Your time is : " + time);

     }

   }     