
package ranieljorsymain;

import java.math.BigInteger;
import java.util.Scanner;

public class Stirling extends PascalTri{
public void Strlng(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'n': ");
        int n = sc.nextInt();
        System.out.print("Enter value of 'k': ");
        int k = sc.nextInt();

                if ((k > 500) ||( k<1)){
                     System.out.println("   ------ Input of K must be 1-500 only. -----");
                  }      
                else if (k > n) {
                     System.out.println(" ----- No Answer -----");
                  }
                else if ((n > 500) ||( n<0)){
                     System.out.println("   ------ Input of N must be 0-500 only. -----");
                  }
                else{
                    int j = k;
                    BigInteger q = BigInteger.valueOf(-1); // value of (-1)^j
                    BigInteger q2 = BigInteger.valueOf(-1); // value of (-1)^j

                    BigInteger jn; // use for value of (j-i)^n
                    BigInteger jn1; // use for value of (j-i)^n
                    BigInteger ans = BigInteger.ZERO; // for final answer
                    
                    for (int x = 0;x < j;x++) {
				q = (q).multiply(q2);
				BigInteger comb1 = factorial(j).divide(factorial(x).multiply(factorial(j-x)));
				jn = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
				jn1 = BigInteger.valueOf(j).subtract(BigInteger.valueOf(x));
                                
			for(int z = 1;z < n;z++) {
                               jn = jn.multiply(jn1);
                            }
                        ans = ans.add((q).multiply(comb1).multiply(jn));
                    }
			System.out.println("\nThe Stirling computation of " + n +" and " + j + " is: " + ans.divide(factorial(j)));
		}    
        }
}
