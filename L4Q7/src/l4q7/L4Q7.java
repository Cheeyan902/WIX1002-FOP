package l4q7;

import java.util.Scanner;
public class L4Q7 {
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int P,N,n,j;
       double M,i,Cn,Ln,Rn;
       double total_interest = 0;
       
        System.out.print("Enter principal amount: ");
        P = sc.nextInt();
        System.out.print("Enter interest in %: ");
        i = sc.nextDouble();
        System.out.print("Enter total number of month(s): ");
        N = sc.nextInt();
        System.out.println("\n");
        
        System.out.printf("%-8s %18s %18s %18s %18s %18s %n", "Month","Monthly Payment","Principle","Interest","Unpaid Balance","Total Interest");
        System.out.println("____________________________________________________________________________________________________________________");
        
        for(j=1; j<=N; j++){
            n=j;
            M = (P*(i/1200))/(1-Math.pow((1+(i/1200)),-N));
            Cn = (M*(Math.pow((1+(i/1200)),-(1+N-n))));
            Ln = M-Cn;
            Rn = (Ln/(i/1200))-Cn;
            total_interest += Ln;
            System.out.printf("%-8d %15.2f %18.2f %18.2f %18.2f %18.2f %n",n,M,Cn,Ln,Rn,total_interest);
        }
    }
    
}
