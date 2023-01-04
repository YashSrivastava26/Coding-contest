
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Binod
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();

		while(t-- != 0){
			int size = s.nextInt();
			int noOfQuery = s.nextInt();

            int arrBinary[][] = new int[60][size];
            for (int i = 0; i < size; i++) {
                long num = s.nextLong();
                for (int j = 0; j < 60; j++) {
                    arrBinary[j][i] = (int) (num % 2);
                    num = num / 2;
                }
            }

            //storing no of set bit ar i pos for prev nums
            for (int i = 0; i < 60; i++) {
                int countSetBitsIn_ith_Pos = 0;
                for (int j = 0; j < size; j++) {
                    countSetBitsIn_ith_Pos += arrBinary[i][j];
                    arrBinary[i][j] = countSetBitsIn_ith_Pos;
                }
            }

            while(noOfQuery-- != 0){
                int k = s.nextInt();
                int l1 = s.nextInt();
                int r1 = s.nextInt();
                int l2 = s.nextInt();
                int r2 = s.nextInt();
                
                //converting to 0 based index
                l1--;
                r1--;
                l2--;
                r2--;

                long leftLen = r1 - l1 + 1;
                long rightLen = r2 - l2 + 1;

                long setBitInLeft, setBitInRight;

                if(l1 == 0)
                    setBitInLeft = arrBinary[k][r1];
                else
                    setBitInLeft = arrBinary[k][r1] - arrBinary[k][l1 - 1];
                
                if(l2 == 0)
                    setBitInRight = arrBinary[k][r2];
                else
                    setBitInRight = arrBinary[k][r2] - arrBinary[k][l2 - 1];
                
                
                long ans = (leftLen - setBitInLeft) * setBitInRight;
                ans += (rightLen - setBitInRight) * setBitInLeft;

                System.out.println(ans);
            }
		}
	}
}