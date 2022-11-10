import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            float X = s.nextInt();
            float Y = s.nextInt();
            if(Y >= 0.5 * X) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
	}
}
