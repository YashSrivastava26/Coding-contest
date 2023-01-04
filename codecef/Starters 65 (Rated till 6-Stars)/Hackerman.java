import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Hackerman
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t-- != 0){
			int a = s.nextInt();
			int b = s.nextInt();
			//2,3,4,5,6,7,8,9,10,11,12
            int sum = a + b;
            if(sum == 2 || sum == 3 ||sum == 5 ||sum == 7 ||sum == 11) System.out.println("Alice");
			else System.out.println("Bob");
		}
	}
}