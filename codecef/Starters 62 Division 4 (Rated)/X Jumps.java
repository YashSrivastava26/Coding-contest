import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int x = s.nextInt(), y = s.nextInt();
            int ans = x % y + x / y;
            System.out.println(ans);
        }
	}
}