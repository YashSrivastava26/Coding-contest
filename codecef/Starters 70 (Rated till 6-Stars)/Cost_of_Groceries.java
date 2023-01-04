import java.util.Scanner;

/**
 * Cost_of_Groceries
 */
class Cost_of_Groceries {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int min = s.nextInt();
            int ans = 0;

            int fresh[] = new int[n];
            int cost[] = new int[n];

            for (int i = 0; i < n; i++) {
                fresh[i] = s.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                cost[i] = s.nextInt();
                if(fresh[i] >= min) ans += cost[i];
            }

            System.out.println(ans);
        }
    }
}