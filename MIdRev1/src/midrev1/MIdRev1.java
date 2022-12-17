package midrev1;

import java.util.Scanner;
public class MIdRev1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        int X,Y;
        char R,L,U,P;
        for(int j=0; j<3; j++){
        System.out.print("Enter the coordinate X and Y: ");
        X = cs.nextInt();
        Y = cs.nextInt();
        System.out.print("Enter the move: ");
        String a = cs.next();
        char [] array = a.toCharArray();
        System.out.println("Initial Coordinate " + "(" + X + "," + Y + "}");
        for(int i=0; i<array.length;i++){
            switch(array[i]){
            case 'R' -> X++;
            case 'L' -> X--;
            case 'U' -> Y++;
            case 'D' -> Y--;
            default -> System.out.println("Invalid");
            }
        }
        System.out.println("Final Coordinate " + "(" + X + "," + Y + "}");   
        System.out.println();
    }
  }
}
 