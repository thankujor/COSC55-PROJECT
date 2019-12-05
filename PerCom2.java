
package ranieljorsymain;

import java.math.BigInteger;
import java.util.Scanner;


public class PerCom2 extends PerCom {
    public void PeCo2(){
		Scanner sc = new Scanner(System.in);		
                System.out.println("\n     ----- Choose if ----- ");
		System.out.print("1. Permutation with Repetition \n2. Combination with Repetition: \n");
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
                  else if (r==0){
                    System.out.println("\nPermutation of " +" " + n + " and " + r +" "+ "is: 1\n");
                    
                  }
                  else {			
			BigInteger perm = BigInteger.valueOf(n);
			BigInteger rep = BigInteger.valueOf(n);
			for (int i = 1;i < r;i++) {
				perm = perm.multiply(rep);
			}
                      System.out.println("\nPermutation of " +" " + n + " and " + r +" "+ "is: "+ perm + "\n");
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
			BigInteger comb = factorial((n+r)-1).divide(factorial(r).multiply(factorial(n-1)));
                      System.out.print("\nCombination of " +" " + n + " and " + r +" "+ "is: "+ comb+ "\n");		}
                  break;
              }
          default: 
			System.out.print("\n  -----NUMBER YOU ENTERED IS NOT IN THE CHOICES-----\n");
		break;
	}
}
}
