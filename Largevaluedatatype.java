   class Largevaluedatatype
  {
    public static void main(String [] args)

     {

      int primelimit = 11111111111;  //error: integer number too large int primelimit = 11111111111;//

      int sum = 1;

      for(int i = 1;i< primelimit + 1; i++)

       {
           if((primelimit % i) == 0)

           {

            sum *=i;

             System.out.println(i);

             }

              if(sum == primelimit)

              {

                break;


                }
              }
           }
         }