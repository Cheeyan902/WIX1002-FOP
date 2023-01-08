package l8q1_number;

public class Number {
    
     private final int[] Array;
        
        //Constructors
        public Number(){
            Array = new int [10];
            for(int i=0; i<10; i++){this.Array[i] = (int)(Math.random()*101);
            }
        }
        
        public Number(int n){
            Array = new int [n];
            for(int i=0; i<n; i++){this.Array[i] = (int)(Math.random()*101);
            }
        }
        
        public Number(int n, int b){
            Array = new int [n];
            for(int i=0; i<n; i++){this.Array[i] = (int)(Math.random()*101);
            }
        }
       
        
        //Methods
        public void displayAll(){
            System.out.print("All the numbers of the array: ");
            for(int i=0; i<this.Array.length; i++){
                System.out.print(this.Array[i] + " ");
            }
            System.out.println();
        }
        
        
        public void displayEven(){
            System.out.print("All the even numbers of the array: ");
            for(int i=0; i<this.Array.length; i++){
                if(this.Array[i]%2==0){
                    System.out.print(this.Array[i] + " ");
                }
            }
            System.out.println();
        }
        
        
        public void displayPrime(){
            System.out.print("All the prime numbers of the array: ");
            for(int i=0; i<this.Array.length; i++){
              if(isPrime(this.Array[i]))
                    System.out.print(this.Array[i] + " ");
            }
            System.out.println();
        }
        
        private boolean isPrime(int b){
            for(int j=2; j<=Math.sqrt(b); j++){
                if(b%j==0){
                    return false;
                }
            }
            return true;
        }
        
        
        public void displayMax(){
            System.out.print("The maximum number of the array: ");
            int max = this.Array[0];
            for(int i=1; i<this.Array.length; i++){
                if(this.Array[i] > max){
                    max = this.Array[i];
                }
            }
            System.out.printf("%d\n", max);
        }
        
        
        public void displayMin(){
            System.out.print("The minimum number of the array: ");
            int min = this.Array[0];
            for(int i=1; i<this.Array.length; i++){
                if(this.Array[i] < min){
                    min = this.Array[i];
                }
            }
            System.out.printf("%d\n", min);
        }
          
        
        public void displayAvg(){
            System.out.print("The average of the numbers of the array: ");
            int sum = 0;
            for(int i=0; i<this.Array.length; i++){
                sum += this.Array[i];
            }
                   System.out.printf("%.2f\n", sum/(double)this.Array.length); 
        }
        
        
        public void displaySqr(){
            System.out.print("All squared numbers of the array: ");
            for(int i=0; i<this.Array.length; i++){
                System.out.print((this.Array[i] * this.Array[i]) + " ");
            }
            System.out.println();
        }
        
}
