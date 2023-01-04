import java.util.*;
/**
 * A_Joey_Takes_Money
 */
public class A_Joey_Takes_Money {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];
            long prod = 1;

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                prod *= arr[i];
            }
            long ans = 2022 * (prod + n - 1);
            System.out.println(ans);
        }
    }
}