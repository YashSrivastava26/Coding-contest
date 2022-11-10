import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int ans = x * (int)Math.ceil((double) y / z);
            System.out.println(ans);
        }
	}
}
