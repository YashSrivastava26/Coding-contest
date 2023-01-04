import java.util.Arrays;
import java.util.Scanner;

/**
 * Monopoly_in_Chefland
 */
public class Monopoly_in_Chefland {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int arr[] = new int[3];
            arr[0] = s.nextInt();
            arr[1] = s.nextInt();
            arr[2] = s.nextInt();
            Arrays.sort(arr);

            int sum = arr[0] + arr[1];
            if(sum < arr[2]) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}