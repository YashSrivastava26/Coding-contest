import java.util.Scanner;

/**
 * Indirect_Sort
 */
public class Indirect_Sort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            if(arr[0] == 1)System.out.println("Yes");
            else System.out.println("No");
        }
    }
}