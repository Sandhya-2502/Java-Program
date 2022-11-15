  public class IncompatiableTypeCasting

  {
     public static void main(String []args)

      {
        double a = 10.5;

        double b = 5.0;
  
        System.out.println("a: "+a + "\tb: "+b);
       
        int x = a;  // Incompetiable types : possible lossy conversion from double to int
        
        int y = b;  // Incompetiable types : possible lossy conversion from double to int

        System.out.println("x: "+x + "\tb: "+y);
        
       }
    }