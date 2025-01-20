public class Prime {
    public static int primeNumber(int number) {
      
    int j = 0;
        for (int i = 2; i * i <= number; j++) {
            if (number % i == 1) {
                
            }
        }
        
        return j;
    }

    public static void main(String... args) {
        int n = 10;
        System.out.println(primeNumber(n));
    }
}




