import java.util.Scanner;

/**
 * TwoGroups
 */
public class TwoGroups {

    int solution(int idx, int[] arr, int sum1, int sum2){
        if(idx == arr.length) return sum;

        int takeInfirst = solution(idx + 1, arr, sum1 + arr[idx], sum2);
        int takeInSecond = so
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            solution(size - 1, arr, 0);
        }
    }
}