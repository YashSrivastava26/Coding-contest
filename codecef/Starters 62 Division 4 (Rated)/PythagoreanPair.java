import java.util.Scanner;

class Codechef
{

    static void solution(long N){
        for (int i = 1; i <= (int)Math.sqrt(N); i++) {
            int sq = i * i;
            long diffrence = N - sq;
            int b = (int)Math.sqrt(diffrence);
            if (b * b == diffrence){
                System.out.println(i + " " + b);
            }
        }
        System.out.println("-1");
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            long n = s.nextLong();
            solution(n);
        }      
	}
}