
import java.util.Scanner;

class Split_and_Maximize
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            long sumArr = 0;
            int mod = 998244353;
            for (int i = 0; i < size; i++) {
                int temp = s.nextInt();
                sumArr += temp; 
                sumArr %= mod;
            }
            long ans = (sumArr * (sumArr - 1)) % mod ;
            System.out.println(ans);
        }
	}
}