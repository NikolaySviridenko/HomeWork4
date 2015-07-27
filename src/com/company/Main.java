package com.company;

public class Main {

    public static void main(String[] args) {
        int[] operand1 = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
        boolean b = true;
        for (int i = 0; i<=12; i++)
{

 int sum = operand1[i]+operand2[i];
   if (sum == expectedResults[i])
   {
      if ((i==12)  && (b==true))
      {
          System.out.println("Tests Passed");
//       continue;
      }
   }

  else
 {
     b=false;
      System.out.println("Expected: "+ sum + " Actual: "+ expectedResults[i]);
      System.out.println("Tests FAILED");

      continue;
 }



}
//     for(int j = 0; j<=my.length-1; j++)
//     {
//if (my[j] == expectedResults[j])
//{
//
//}
//         if (my [12]== expectedResults[12])
//         {
//             System.out.println("Tests PASSED");
//         }
//     }


    }
}
