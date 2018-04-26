package ravi.SamplePrograms.gorebal;

import java.util.Scanner;


//          CHALLENGE :         
//   Reverse Floyd's Triangle   



 
// Floyd's triangle consisting 
// of 5 rows looks like this :
 
//    15  14  13  12  11
//    10   9   8   7
//     6   5   4
//     3   2
//     1


 
public class ReverseFloydsTriangle
{
   public static void main(String[] args) {
       System.out.println(
       "*** Reverse Floyd's Triangle ***\n");
       Scanner in = new Scanner(System.in);
       // Enter number of rows :
       int numOfRows = in.nextInt();
       
       int nextNum;
       nextNum = numOfRows*(numOfRows+1)/2;
       
       for(int i=numOfRows; i>=1; i--) {
           for(int j=i; j>=1; j--) {
               System.out.format("%3d", nextNum--);
           }
           System.out.println();
       }
   }
}



