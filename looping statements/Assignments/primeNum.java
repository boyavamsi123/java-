public class primeNum {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 50 and 150:");
        for (int num = 50; num <= 150; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
