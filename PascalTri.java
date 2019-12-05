
package ranieljorsymain;
import java.util.Scanner;

public class PascalTri extends PerCom2 {
    public void pascal(){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nInput Pascal Row to Generate:");
		int n = sc.nextInt();
                if ((n >= 0 )&& (n <=500)){
                    System.out.println("\n       -----------Pascal Triangle Row "+ n +"-----------\n ");

                        for(int r = 0;r <= n; r++) {
                                System.out.print(" | " + Combination(n,r));
                        }
                        System.out.println("");
                    
                }
                else if ((n < 0)|| (n > 500) ){
                    System.out.println("\n----- Input Must be 0 - 500 only. -----\n");
                }
        }
}
