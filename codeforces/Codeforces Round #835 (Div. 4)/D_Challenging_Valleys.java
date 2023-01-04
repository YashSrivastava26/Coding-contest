import java.util.*;

/**
 * D_Challenging_Valleys
 */
public class D_Challenging_Valleys {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            
            int n = s.nextInt();
            int arr[] = new int[n];
            arr[0] = s.nextInt();
            
            for (int i = 1; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int i = 0;
            while(i < n - 1){
                if(arr[i] < arr[i + 1]) break;
                i++;
            }
            if(i == n - 1) System.out.println("YES");
            else{
                int j = i;
                while(j < n - 1 && arr[j + 1] >= arr[j])j++;
                //System.err.println(i + " " + j);
                if(j == n - 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}