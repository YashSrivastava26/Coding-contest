import java.util.*;
/**
 * D_Make_It_Round
 */
public class D_Make_It_Round {
    static int countEndZero(int num){
        if(num % 10 != 0) return 0;
        return 1 + countEndZero(num / 10);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int temp = m;
            
            
            int countDigitsInM = 0; 
            while(temp != 0){
                countDigitsInM++;
                temp /= 10;
            }
            
            int maxi = 1, maxiIdx = 1;
            for (int i = 1; i <= Math.min(9, m); i++) {
                int num = n * i;
                int curr0s = countEndZero(num);
                if(curr0s >= maxi){
                    maxi = curr0s;
                    maxiIdx = i;
                }
            }

            long ans = n * maxiIdx * (int) Math.pow(10, countDigitsInM - 1);
            System.out.println(ans);
            System.out.println(countDigitsInM);
            System.out.println(n);
            System.out.println(maxiIdx);
            System.out.println();
            
        }
    }
}