
import java.util.Scanner;


class Fact{
    public long fact[] = new long[(int) 1e6 + 1];
    public int mod = (int) 1e9 + 7;
    void factorial(){    
        fact[0] = 1;
        fact[1] = 1;
        for (int i = 2; i < fact.length; i++) {
            fact[i] = fact[i - 1] * i;
            fact[i] %= mod; 
        }
    }
}

class Spliting_Balls
{
    
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Fact f = new Fact();
        f.factorial(); 
        int mod = (int) 1e9 + 7;
        while(t-- != 0){
            int size = s.nextInt();
            int ans = 0;
            for (int i = 0; i < size; i++) {
                int temp = s.nextInt();
                ans = (int) (ans + f.fact[temp]);
                ans %= mod;
            }
            System.out.println(ans);
        }
	}
}