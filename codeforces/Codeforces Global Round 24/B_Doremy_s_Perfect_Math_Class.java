
import java.util.Scanner;

/**
 * B_Doremy_s_Perfect_Math_Class
 */
public class B_Doremy_s_Perfect_Math_Class {
    
    private static int hcf(int a, int b) {
        if(b == 0) return a;
        return hcf(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();

            int hcfResult = s.nextInt(), maxi = Integer.MIN_VALUE;

            for (int i = 1; i < n; i++) {
                int temp = s.nextInt();
                hcfResult = hcf(hcfResult, temp);
                maxi = Math.max(maxi, temp);
            }
            
            int ans = maxi / hcfResult;
            System.out.println(ans);
        }
    }
}