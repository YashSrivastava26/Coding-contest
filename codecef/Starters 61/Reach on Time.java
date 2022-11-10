import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int x = s.nextInt();
            if(x < 30) System.out.println("NO");
            else System.out.println("YES");
        }
	}
}