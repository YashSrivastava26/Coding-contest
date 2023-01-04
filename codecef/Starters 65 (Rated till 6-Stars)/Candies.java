
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t-- != 0){
			int n = s.nextInt();
            int totalcandies = 2 * n;
            HashMap < Integer, Integer > hash = new HashMap<>();
            boolean flag = true;
            int arr[] = new int[totalcandies];
            for (int i = 0; i < totalcandies; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 2; j < arr.length; j++) {
                if(arr[j] == arr[j - 2]) flag = false;
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
		}
	}
}