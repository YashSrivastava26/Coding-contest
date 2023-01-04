import java.util.Scanner;

/**
 * A_Two_Permutations
 */
public class A_Two_Permutations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t-- != 0){
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();

            if(a == n && b == n){
                System.out.println("Yes");
                continue;
            }
            if(a + b + 2 <= n) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}