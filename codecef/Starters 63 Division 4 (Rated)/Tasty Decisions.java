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
            x *= 2;
            y *= 5;
            if(x > y) System.out.println("Chocolate");
            else if(x == y) System.out.println("Either");
            else System.out.println("Candy");
        }
	}
}