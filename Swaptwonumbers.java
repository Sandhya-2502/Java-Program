public class Swaptwonumbers
  {
   
      public static void main(String[] args)
    {
        int n1 = 20;
        int n2 = 30;
        int temp;
      
        System.out.println("Before Swap" +n1 +","+n2);
      
        temp = n1;
          n1 = n2;
          n2 = temp;

        System.out.println("After Swap" +n1 +","+n2);
      


      
         int x = 10;
         int y = 40;

       System.out.println("Before Swap" +x +","+y);
      
          x = x + y;
          y = x - y;
          x = x - y;
        
       System.out.println("After Swap" +x +","+y);
     }
  }
          