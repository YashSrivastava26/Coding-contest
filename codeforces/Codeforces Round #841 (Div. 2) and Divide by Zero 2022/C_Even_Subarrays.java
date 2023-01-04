import java.util.*;

/**
 * C_Even_Subarrays
 */
public class C_Even_Subarrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int xor[] = new int[n];
            int xr = 0;
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int temp = s.nextInt();
                xr = xr ^ temp;
                xor[i] = xr;
                if(xr == 0) continue;
                int rootInt =(int) Math.sqrt(xr);
                double rootDouble = Math.sqrt(xr);
                if(rootDouble != rootInt) ans++;
            }
            for (int i = 1; i < n; i++) {
                int curr[] = new int[n];
                for (int j = i; j < n; j++) {
                    curr[j] = xor[j - 1] ^ xor[j] ^ curr[j - 1];
                    if(curr[j] == 0) continue;
                    int rootInt =(int) Math.sqrt(curr[j]);
                    double rootDouble = Math.sqrt(curr[j]);
                    if(rootDouble != rootInt) ans++;
                }
                xor = curr;
            }

            System.out.println(ans);
        }
    }
}

