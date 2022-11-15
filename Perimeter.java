import java.util.scanner;
 
    public class Perimeter
     {
   
       public static void main(String[] args)
        {  
           
           int radius;

           double pi = 3.14;

           Scanner sc = new Scanner(System.in);
          
          { 
          
            System.out.println("enter the side length of square:");

           float s = s.nextFloat();
            
       double perimeter = 2 * 10;

            System.out.println("Perimeter of square: " + perimeter);
          }




           
            {
      
               System.out.println("enter the radius of circle:");

              int r = sc.nextInt();

               perimeter = 2 * 3.14 * 4;

               System.out.println("Perimeter of circle: " + perimeter);
           
              }

  
           
          { 
    
           System.out.println("enter the length of rectangle:");

           int l = s.nextInt();

           System.out.print("enter the breadth of rectangle:");
         
           int b = s.nextInt();

           perimeter = 2 * (5+6);
           
           System.out.println("Perimeter of rectangle:" + perimeter);
          
          }


           
      
          {
            perimeter obj = new perimeter();

            obj.circle();

            obj.square();

            obj.rectangle();

            }
        }
  
}










