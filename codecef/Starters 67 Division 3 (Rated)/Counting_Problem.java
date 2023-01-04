import java.util.Scanner;

/**
 * Counting_Problem
 */
class Counting_Problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];

            int countOdd = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if(arr[i] % 2 == 1) {
                    countOdd++;
                }
            }
            if((countOdd % 2) == 0 && countOdd != 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}