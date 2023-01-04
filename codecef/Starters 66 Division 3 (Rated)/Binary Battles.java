import java.util.Scanner;

class Codechef
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            long n = s.nextLong();
            int a = s.nextInt();
            int b = s.nextInt();

            long x = (a * n / 2) + (b * (n - 1) / 2);
            int num = (int) (Math.log(n) / Math.log(2));
            System.out.println(num + " " + x);
            double mul = (2 * (1 - Math.pow(1 / 2, num)));
            System.out.println(x);

            long gpSum = (long)(x * mul);
            System.out.println(gpSum);
        }
    }
}