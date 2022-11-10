import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            int arr[] = new int[size];
            int maxi = 0, maxIdx = -1;
            for (int i = 0; i < args.length; i++) {
                arr[i] = s.nextInt();
                if(arr[i] >= maxi){
                    maxi = arr[i];
                    maxIdx = i;
                }
            }
            if(maxIdx != size - 1) System.out.println("-1");//incomplete
        }
	}
}
