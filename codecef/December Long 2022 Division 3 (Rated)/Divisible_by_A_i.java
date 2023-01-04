import java.util.Scanner;
/**
 * Divisible_by_A_i
 */
class Divisible_by_A_i {

    static int Gcd(int x, int y)
    {
        if (y == 0)
            return x;
        return Gcd(y, x % y);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int arr[] = new int[n];

            arr[0] = s.nextInt();
            int higestFactor = arr[0];

            for (int i = 1; i < n; i++) {
                arr[i] = s.nextInt();
                higestFactor = Gcd(higestFactor, arr[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] / higestFactor + " ");
            }
            System.out.println();


        }
    }
    
}