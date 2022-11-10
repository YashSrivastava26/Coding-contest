import java.util.Scanner;

/**
 * FunnyPermutation
 */
public class FunnyPermutation {
    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void leftRotate(int arr[], int n, int d)
    {
        d = d % n;
        if(d == 0) return;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        
    }

    public static void printFunny(int n){
        if(n == 2) System.out.println("2 1");
        else if(n == 3) System.out.println("-1");
        else{
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
            leftRotate(arr, n, 2);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int n = s.nextInt();
            printFunny(n);
            t--;
        }
    }
}