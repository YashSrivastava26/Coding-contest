import java.util.Scanner;

class Codechef
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();

            long timeTaken = 0;
            while(n != 0){
                timeTaken += a * n + (n - 1) * b;
                n /= 2;
            }
            System.out.println(timeTaken);
        }
    }
}