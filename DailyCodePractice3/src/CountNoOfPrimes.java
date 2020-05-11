public class CountNoOfPrimes {

    public static void main(String[] args) {
        int n = 14;
        //System.out.println(countPrimes(n));
        System.out.println(isPrime(79));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if(n == 2){
            return true;
        }
        if(n>2 && n % 2 == 0){
            return false;
        }else {
            int count = 0;
            for (int i = 3; i < Math.sqrt(n); i=i+2) {
                if (n % i == 0) {
                    count++;
                }
            }
        }
        return true;
    }
}
