package l6q2;

import java.util.Scanner;
public class L6Q2 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        System.out.print("Enter the number of n copies: ");
        int n = cs.nextInt();
        System.out.print("Enter the character: ");
        char c = cs.next().charAt(0);
        System.out.println();
        multiPrint(n,c);
        System.out.println();
        
        System.out.println("Triangle: ");
        System.out.println();
        displaytri(n,c);
        System.out.println();
        
        System.out.print("Diamond: ");
        System.out.println();
        displaydia(n,c);
        System.out.println();
    }
    
    public static void multiPrint(int n, char c){
        for(int i =1; i<=n; i++){
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
    public static void displaytri(int n, char c){
        for(int i =1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(c + " ");
            }
          System.out.println();
        }
    }
    
    public static void displaydia(int n, char c){
        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){        //only can j>i means max 4 spaces cuz we only got 4 rows down there to make it more tidy
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(c + " ");
            }
          System.out.println();
        }
         for(int i=1; i<=n-1; i++){
            for(int j=1; j<=i; j++){  // max 4 spaces
                System.out.print(" ");
            }
            for(int j=n-1; j>=i; j--){
                System.out.print(c + " ");
            }
           System.out.println();
         }
    }
}
