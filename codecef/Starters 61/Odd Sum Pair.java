import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
            if((a % 2 == 0 && b % 2 == 0 && c % 2 == 0) || (a % 2 == 1 && b % 2 == 1 && c % 2 == 1))
                System.out.println("NO");
            else System.out.println("YES");
        }
	}
}