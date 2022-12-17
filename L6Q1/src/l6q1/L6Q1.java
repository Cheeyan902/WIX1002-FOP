package l6q1;

public class L6Q1 {

    public static void main(String[] args) {
      System.out.print("The first 20 triangular number(s): ");
        for(int i=1; i<=20; i++){
            System.out.print(trinum(i) + " ");
    }
  }
    
    public static int trinum(int input){
        int num =0;
        for(int i=1; i<=input; i++){
          num+=i;
        }
    return num;
    } 
}

// second method 
/*System.out.print("Enter the first 20 triangular numbers: ");
        istrinum();
    }
 
    public static void istrinum(){
        int k =0;
        for(int i=1; i<=20; i++){
            k+=i;
            System.out.print(k + " ");
        }
    }*/