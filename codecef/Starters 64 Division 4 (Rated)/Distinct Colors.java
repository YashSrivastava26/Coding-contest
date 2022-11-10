import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            int arr[] = new int[size];
            int maxi = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
                maxi = Math.max(maxi, arr[i]);
            }
            System.out.println(maxi);
        }
	}
}