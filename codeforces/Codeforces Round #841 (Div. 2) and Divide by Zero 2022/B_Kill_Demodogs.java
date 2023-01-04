import java.math.BigInteger;
import java.util.*;
/**
 * B_Kill_Demodogs
 */
public class B_Kill_Demodogs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long mod = (long) 1e9 + 7;
        while(t-- != 0){
            long n = s.nextLong();
            BigInteger ans = BigInteger.ZERO;
            ans = ans.add(BigInteger.valueOf(n));
            ans = ans.multiply(BigInteger.valueOf(n + 1));
            ans = ans.multiply(BigInteger.valueOf(4 * n - 1));
            ans = ans.divide(BigInteger.valueOf(6));
            ans = ans.multiply(BigInteger.valueOf(2022));
            ans = ans.mod(BigInteger.valueOf(mod));
            // long ans = n * (n + 1) *(4 * n - 1) / 6;
            // ans = ans * 2022;
            // ans %= mod;
            System.out.println(ans);
        }
    }
}