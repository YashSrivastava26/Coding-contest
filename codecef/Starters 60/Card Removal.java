import java.util.Arrays;
import java.util.Scanner;

class Codechef
{
    public static void solution(int[] arr){
        int freq = 1, maxFreq = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]){
                freq ++;
            }
            else {
                if(maxFreq < freq) maxFreq = freq;
                freq = 1;
            }
        }
        maxFreq = Math.max(maxFreq, freq);
        System.out.println(arr.length - maxFreq);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            solution(arr);
            t--;
        }
	}
}