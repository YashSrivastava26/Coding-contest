
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Nahaane_Jaa
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t-- != 0){
			int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            HashMap <Integer, Integer> hash = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if(!hash.containsKey(arr[i])){
                    hash.put(arr[i], i);
                }
            }
            if(!hash.containsKey(k)) System.out.println("No");
            else{
                int idx = hash.get(k);
                if(idx < n - 1) System.out.println("Yes");
                else if(n == 1) System.out.println("Yes");
                else System.out.println("No");
            }
		}
	}
}