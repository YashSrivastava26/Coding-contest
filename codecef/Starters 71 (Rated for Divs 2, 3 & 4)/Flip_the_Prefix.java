import java.util.*;


/**
 * template
 */
class Flip_the_Prefix {

    static void solution(String s1, int n, int k){
        int dp[] = new int[n], cnt = 0, ans= Integer.MAX_VALUE;

        for(int i = 1; i < n; i++){
            if(s1.charAt(i - 1) != s1.charAt(i)){
                cnt++;
                dp[i]=cnt;
            }
            else
            dp[i]=cnt;
        }
        dp[0]=0;
        for(int i = n - 1; i >= 0; i--){
            if((i - (k - 1)) < 0) {
                break;
            }
            int tempans = dp[i] - dp[i - k + 1];
            if(s1.charAt(i) == '0') {
                tempans++;
            }
            ans = Math.min(ans, tempans);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int k = s.nextInt();
            String binary = s.next();

            solution(binary, n, k);
        }
    }
}