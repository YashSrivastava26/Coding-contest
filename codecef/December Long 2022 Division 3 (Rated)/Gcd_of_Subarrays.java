import java.util.Scanner;

/**
 * Gcd_of_Subarrays
 */
class Gcd_of_Subarrays {

    static int kMin(int n){
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            long k = s.nextLong();

            int minK = kMin(n);
            if(k < minK){
                System.out.println("-1");
                continue;
            }

            long firstEle = k - minK + 1;
            for (int i = 0; i < n; i++) {
                if(i == 0) System.out.print(firstEle + " ");
                else System.out.print("1 ");
            }
            System.out.println();
        }
    }
    
}
