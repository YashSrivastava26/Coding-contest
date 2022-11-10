/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Building_Race
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int A = s.nextInt();
            int B = s.nextInt();
            int X = s.nextInt();
            int Y = s.nextInt();
            if((A / X) ==  (B / Y)) System.out.println("Both");
            else if((A / X) > (B / Y)) System.out.println("Chefina");
            else System.out.println("Chef");
            t--;
        }
	}
}