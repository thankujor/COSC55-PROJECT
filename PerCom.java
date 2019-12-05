
package ranieljorsymain;

import java.math.BigInteger;
import java.util.Scanner;


public class PerCom extends Formula {
    public void PeCo(){
        
		Scanner sc = new Scanner(System.in);
                System.out.println("\n     ----- Choose if ----- ");
		System.out.print("1. Permutation without Repetition \n2. Combination without Repetition: \n");
                System.out.print("\nEnter Number of Choice Here:");
		int choose = sc.nextInt();
           
      switch (choose) {
          case 1:
              {
                  System.out.print("Enter number for 'n': ");
                  int n = sc.nextInt();
                  System.out.print("Enter number for 'r': ");
                  int r = sc.nextInt();
                  
                  if (((n > 500) ||( n<0) || (r > 500) ||( r<0))){
                      System.out.println("\n   ------ input of N and R must be 0-500 only. -----\n");
                  }      
                  else if (r > n) {
                      System.out.println("\n ----- N must be greater than R -----\n");
                  }
                  else {
                      BigInteger per = factorial(n).divide(factorial(n-r));
                      System.out.println("\nPermutation of " +" " + n + " and " + r +" "+ "is: "+ per + "\n");
                  }
                  break;
              }
          case 2:
              {
                  System.out.print("Enter number for 'n': ");
                  int n = sc.nextInt();
                  System.out.print("Enter number for 'r': ");
                  int r = sc.nextInt();
                  if (((n > 500) ||( n<0) || (r > 500) ||( r<0))){
                      System.out.println("\n   ------ input of N and R must be 0-500 only. -----\n");
                  } 
                  else if(r > n) {
                      System.out.println("\n ----- N must be greater than R -----\n");
                  }
                  else {
                      
                      BigInteger combi = Combination(n,r);
                      System.out.print("\nCombination of " +" " + n + " and " + r +" "+ "is: "+ combi+ "\n");
                  }
                  break;
              
              }
          default:
              System.out.print("\n-----NUMBER YOU ENTERED IS NOT IN THE CHOICES-----\n");
              break;
      }
}

}
