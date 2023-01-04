import java.util.*;


/**
 * template
 */
class Maximizing_LCS {

    static int longestCommonSubsequence(String s1, String s2) {
        int x = s1.length(),y = s2.length();
        int dp[][] = new int[x + 1][y + 1];
        
        for (int ptr1 = 1; ptr1 < x + 1; ptr1++) {
            for (int ptr2 = 1; ptr2 < y + 1; ptr2++) {
                int currLen = 0;
                if(s1.charAt(ptr1 - 1) == s2.charAt(ptr2 - 1)){
                    currLen = 1 + dp[ptr1 - 1][ptr2 - 1];
                }
                else{
                    int reduceS1 = dp[ptr1 - 1][ptr2];
                    int reduceS2 = dp[ptr1][ptr2 - 1];
                    currLen = Math.max(reduceS1, reduceS2);
                }
                dp[ptr1][ptr2] = currLen;
            }
        }

        return dp[x][y] / 2;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            String s1 = s.next();
            StringBuilder s2 = new StringBuilder(s1);
            s2 = s2.reverse();

            int ans = longestCommonSubsequence(s1, s2.toString());
            System.out.println(ans);
        }
    }
}