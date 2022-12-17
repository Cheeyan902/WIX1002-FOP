package l6q6;

public class L6Q6 {

    public static void main(String[] args) {
       L6Q6 cs = new L6Q6();
       cs.displayPalindromic(20);
       cs.displayEmirp(20);
    }
    
    void displayPalindromic(int n){
        int i = 0;
        int num = 2;
        System.out.println("The first 20 Palindromic Numbers: ");
        while(i<n){
             if ((((int) Math.log10(num) + 1) % 2 == 0) && !(((int) Math.log10(num) + 1) == 2)) {
                num = (int) Math.pow(10, (int) Math.log10(num) + 1);
            }
            
            if(num == isReverse(num) && isPrime(num)){
                System.out.printf("%d%s",num,(i < (n - 1)) ? ", " : "\n");
            i++;
        }
        num++;
      }
    }

    
    void displayEmirp(int n){
        int i = 0, num = 13;

        System.out.println("The first 20 Emirps: ");
        while (i < n) {
            if (isPrime(num) && num != isReverse(num) && isPrime(isReverse(num))) {
                System.out.printf("%d%s", num, (i < (n - 1)) ? ", " : "\n");
                i++;
            }
            num++;
        }
    }
    
    public static int isReverse(int n){
        int rev = 0;
        
        while(n>0){
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev;
    }
    
    public static boolean isPrime(int n){
         for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { return false; } // lesser than math.sqrt means remainder =0 if divided by i
         }
        return true;
    }
    
}
