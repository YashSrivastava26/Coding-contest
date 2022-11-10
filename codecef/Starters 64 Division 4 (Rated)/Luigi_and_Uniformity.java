import java.util.Scanner;

class Codechef
{
    static int gcdOf2Num(int a, int b)
    {
        if (a == 0)
            return b;
        return gcdOf2Num(b % a, a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            int arr[] = new int[size];
            arr[0]= s.nextInt();
            int gcd = arr[0];
            for (int i = 1; i < arr.length; i++) {
                arr[i] = s.nextInt(); 
                gcd = gcdOf2Num(gcd, arr[i]);
            }
            int count = 0;
            for (int i : arr) {
                if(i != gcd) count++;
            }
            System.out.println(count);
        }
	}
}

