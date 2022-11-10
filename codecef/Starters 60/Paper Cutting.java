import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int N = s.nextInt();
            int X = s.nextInt();
            int ans = (int)Math.floor(N / X);
            System.out.println(ans * ans);
            t--;
        }
	}
}