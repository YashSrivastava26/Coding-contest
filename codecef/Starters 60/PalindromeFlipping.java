import java.util.Scanner;

class PalindromeFlipping
{
    protected static void solution(String s, int size){
        int count_ones = 0, count_zeros = 0;
        for (int i = 0; i < size; i++) {
            if(s.charAt(i) == '1') count_ones++;
            else count_zeros++;
        }
        if((count_ones % 2) != 0 && (count_zeros % 2) != 0)System.out.println("NO");
        else System.out.println("YES");
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            String binartString = s.next();
            solution(binartString, size);
        }
	}
}
