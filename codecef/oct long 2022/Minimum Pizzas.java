import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int N = s.nextInt();
            int X = s.nextInt();
            int noOfPizza = (N * X) / 4;
            if((4 * noOfPizza) < (N * X)) noOfPizza++;
            System.out.println(noOfPizza);
            t--;
        }
	}
}