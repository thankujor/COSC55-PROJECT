
package ranieljorsymain;

import java.math.BigInteger;


public class Formula{
    
    public static BigInteger factorial(int n) {
	BigInteger fact = new BigInteger("1");
        
	if (n == 0) {
		return fact.multiply(BigInteger.valueOf(1));
	}
	else if (n < 0) {
		return fact.multiply(BigInteger.valueOf(-1));
	}
	else {
		for (int i = 2;i <= n;i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
    }
    public static BigInteger Combination(int n,int r) {
            
		BigInteger combi = factorial(n).divide(factorial(r).multiply(factorial(n-r)));
		return combi;
        }

 
}
       
        
