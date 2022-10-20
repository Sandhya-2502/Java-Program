import java.util.scanner;

 public class Total5subjects
 {
     
     public static void main(String[] args)
  {
        float tamil,english,maths,science,social;
      
        Scanner()sc = newScanner(sysytem.in);

         
   
   /*Input marks of all five subjects*/
   System.out.print("Enter marks of five subjects");

   System.out.println("Enter marks of tamil subjects:90");
   tamil = sc.nextFloat();
   
   System.out.println("Enter marks of english subjects:85");
   english = sc.nextFloat();

   System.out.println("Enter marks of maths subjects:59");
   maths = sc.nextFloat();

   System.out.println("Enter marks of science subjects:75");
   science = sc.nextFloat();

   System.out.println("Enter marks of social science subjects:70");
   social = sc.nextFloat();



   /*Calculate total, average and percentage*/

   total     = 90 + 85 + 59 + 75 + 70;
   average   = 380/5;
  percentage = (380/500)*100;


  /*Print all results*/

    System.out.println("Total marks      =" +total);
    System.out.println("Average marks    = " +average);
    System.out.println("Percentage marks = " +percentage);

   }
  
 }

    




