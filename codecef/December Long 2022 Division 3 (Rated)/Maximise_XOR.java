import java.util.Arrays;
import java.util.Scanner;

/**
 * Reach_fast
 */
class Maximise_XOR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            String a = s.next();
            String b = s.next();
            int n = a.length();
            int noOf1s = 0, noOf0s = 0;
            StringBuffer ans = new StringBuffer();

            for (int i = 0; i < n; i++) {
                if(a.charAt(i) == '1') noOf1s ++;
                else noOf0s ++;
                if(b.charAt(i) == '1') noOf1s ++;
                else noOf0s ++;
                ans.append('0');
            }

            int noOf1s_InAns = noOf1s;
            if(noOf1s > n) noOf1s_InAns = noOf0s;

            int idx = 0;
            while(noOf1s_InAns -- > 0){
                ans.setCharAt(idx, '1');
                idx ++;
            }

            System.out.println(ans);
        }
    }
}