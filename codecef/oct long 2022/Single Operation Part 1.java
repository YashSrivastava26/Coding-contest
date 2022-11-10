/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for(int i=numbers.length - 1; i>=0; i--)
            if(numbers[i]=='1')
                result += Math.pow(2, (numbers.length-i - 1));
        return result;
    } 

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int n = s.nextInt();
            String S = s.nextLine();
            int X = binaryToInteger(S);
            int maxX = Integer.MIN_VALUE, maxY = 0;
            for (int Y = 1; Y < S.length(); Y++) {
                int a =X ^ (int) Math.floor( X / (int) (Math.pow(2, Y)));
                if(a > maxX){
                    maxX = a;
                    maxY = Y;
                }
            }            
            System.out.println(maxY);
            t--;
        }
	}
}
