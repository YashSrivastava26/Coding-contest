import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int size = s.nextInt();
            int q = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            int add = 0;
            while(q != 0){
                q--;
                int q1 = s.nextInt(); 
                int q2 = s.nextInt();
                int diff = q2 - q1 + 1;
                if((diff % 2) == 1) add ++; 
            }
            System.out.println(sum + add);
        }
        
	}
}