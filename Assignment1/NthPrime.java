/* Michael Morrison
 * CSC 131 Daryl Posnett
 * Assignment 1 "Nth Prime Finder"
 */ 
 
//import java.util.Scanner;

public class NthPrime {

    public static void main(String[] args) {

        if (args.length==0)
        {
          int primeOUT = 1; 
          int i,j = 0;

          while (i < 100) 
          {
               primeOUT += 1;
               
               for (j = 2; j <= primeOUT; j++) 
               {
                   if (primeOUT % j == 0) 
                   {
                       break;
                   }
               }
               if (j == primeOUT) 
               {
                 System.out.print(" " + primeOUT + ",");
                 i += 1;
               }
          }
          return;
        }
        
        if (args[0].matches("[0-9]+"))
        { 
          int n =  Integer.parseInt(args[0]);     //Assign an integer value to the given input;
          int primeOUT = 1; 
          int i,j = 0;

          while (i < n && i < 100) 
          {
               primeOUT += 1;
               
               for (j = 2; j <= primeOUT; j++) 
               {
                   if (primeOUT % j == 0) 
                   {
                       break;
                   }
               }
               if (j == primeOUT) 
               {
                   i += 1;
               }
          }
           System.out.println("Value of " + n + "th prime: " + primeOUT);
       }
        else  
        {   
            System.out.println("Enter a number to compute the nth prime number: ");
            return;
        }
    }
}
