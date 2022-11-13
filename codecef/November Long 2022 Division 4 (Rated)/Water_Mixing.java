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
            int x = s.nextInt();
            int y = s.nextInt();
            int maxTemp = a + x;
            int minTemp = a - y;
            if(b > maxTemp || b < minTemp) System.out.println("no");
            else System.out.println("yes");
        }
	}
}