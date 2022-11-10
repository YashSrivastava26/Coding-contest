import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            if(size >= 2000) System.out.println("YES");
            else System.out.println("NO");
        }
	}
}