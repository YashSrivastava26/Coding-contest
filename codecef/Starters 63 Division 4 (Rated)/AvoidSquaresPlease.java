import java.util.Scanner;

class AvoidSquaresPlease
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            for (int i = n; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
	}
}

