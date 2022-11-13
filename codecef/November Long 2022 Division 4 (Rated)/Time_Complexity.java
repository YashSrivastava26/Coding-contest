import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            if(a > b) System.out.println("yes");
            else System.out.println("no");
        }
	}
}