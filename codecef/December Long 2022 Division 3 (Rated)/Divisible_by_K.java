import java.util.Scanner;

/**
 * Divisible_by_K
 */
class Divisible_by_K {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            long k = s.nextLong();
            long arr[] = new long[n];
            boolean flg = false;

            arr[0] = s.nextLong();
            long prod = arr[0];
            
            for (int i = 1; i < n; i++) {
                arr[i] = s.nextLong();
                
                
                if(arr[i] % k == 0){
                    flg = true;
                }
    
                
                prod = (prod * arr[i]) % k;
            }
            if(prod == 0) flg = true;
            if(flg) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}