package CodeWars;

public class Persist {
    public static int persistence(long n) {
        int count = 0;
        while(n >= 10){
            count++;
             n = multiplyDigits(n);
        }
        return count;
    }

    public static long multiplyDigits(long n){
        if(n == 0){
            return 0;
        }

        long prod = 1;
        while(n > 0 && prod != 0){
            long num = n % 10;
            prod = prod * num;
            n = n/10;
        }
        return prod;
    }
}
