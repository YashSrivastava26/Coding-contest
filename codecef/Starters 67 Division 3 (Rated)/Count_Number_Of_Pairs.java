import java.util.*;
/**
 * Count_Number_Of_Pairs
 */
public class Count_Number_Of_Pairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            
            int n = s.nextInt();
            int arr[] = new int[n];
            int ans = 0,count = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if(i == arr[i]) count++;
                else if(arr[i] != n && arr[arr[i]] == i){
                    ans++;
                }
            }

            if(count != 0){
                ans += count * (count - 1) / 2;
            }
            System.out.println(ans);

        }
    }
}