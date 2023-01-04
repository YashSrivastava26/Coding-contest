import java.util.*;

/**
 * E_Binary_Inversions
 */
public class E_Binary_Inversions {

    static int cheak(int[] arr){
        int defaultAns = 0;
        int count1s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) count1s++;
            if(arr[i] == 0){
                defaultAns = defaultAns + count1s;
            }
        }
        return defaultAns;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            
            int n = s.nextInt();
            int arr[] = new int[n];
            int firstZero = -1;
            int lastOne = -1;
            
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                
                if(arr[i] == 1) {
                    lastOne = i;
                }
                else if(firstZero == -1 &&  arr[i] == 0) firstZero = i;

                
                //System.out.println(defaultAns);
            }
            int arr2[] = arr.clone();
            
            int ans1 = 0;
            int ans2 = 0;
            if(lastOne >= 0 && lastOne < n){
                arr[lastOne] = 0;
                ans1 = cheak(arr);
            }
            if(firstZero >= 0 && firstZero < n){
                arr2[firstZero] = 1;
                ans2 = cheak(arr2);
            }
            

            int ans = Math.max(ans1, ans2);
            System.out.println(ans);

        }
    }
}