package ranieljorsymain;
import java.util.*;
public class RanielJorsyMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nChoose your desired number in the menu to proceed to the next step.\n");
        System.out.println("    ---------- Menu ----------");
        System.out.println("1. Permutation and Combination w/o Repetition");
        System.out.println("2. Permutation and Combination with Repetition");
        System.out.println("3. Stirling Number of Second Case");  
        System.out.println("4. Pascal Triangle Row Generator");
        System.out.print("\nEnter Number of Choice Here: ");       
    try{
            int Menu = sc.nextInt();
            Stirling answer = new Stirling(); //Multilevel Inheritance
                
                switch (Menu){
                    case 1:{
                        answer.PeCo(); //Permutation and Combination w/o rep
                        Ask();
                        break;
                    }
                    case 2: {
                        answer.PeCo2(); //Permutation and Combination w rep
                        Ask();
                        break;
                    }
                    case 3:{
                        answer.Strlng(); //Stirling
                        Ask();
                        break;
                    }
                    case 4:{
                        answer.pascal(); //Pascal Triangle
                        Ask();
                        break;
                    }
                    default:
                        System.out.println("\n-----NUMBER YOU ENTERED IS NOT IN THE CHOICES -----\n");
                        Ask();
                }               
        }
    catch (InputMismatchException num){
          System.out.println("\n   ----- INVALID INPUT -----\n");
          Ask();
        }
    }
    
    public static void Ask(){
        System.out.println("\n------DO YOU WANT TO CONTINUE USING THE PROGRAM?------ \n             [1]YES      [2]EXIT\n");
        System.out.print("Enter your choice here:");
                Scanner sc = new Scanner(System.in);
                int yorn = sc.nextInt();
                
        switch(yorn){
            case 1:{
                main(null);
            }
            case 2:{
                System.out.println("-------END OF PROGRAM-------");
                System.exit(0);
            }
            default:
                System.out.println("\n-----NUMBER YOU ENTERED IS NOT IN THE CHOICES -----\n");
        }
    }
}

