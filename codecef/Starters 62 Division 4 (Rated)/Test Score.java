import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt(), x = s.nextInt(), y = s.nextInt();
            if(y % x == 0 && y <= x * n) System.out.println("YES");
            else System.out.println("NO");            
        }
	}
}