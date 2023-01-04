import java.util.*;

/**
 * template
 */
class Snapchat {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            long steak = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = s.nextInt();

                if(a[i] == 0 || b[i] == 0) steak = 0;
                else{
                    steak++;
                }
                ans = Math.max(ans, steak);
            }
            System.out.println(ans);
            
        }
    }
}