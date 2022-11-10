import java.util.Scanner;

class WeirdSubarrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            int count = 0, start = 0, intermidate = 0;
            int end = 0;
            while(end < size){
                while(end < size - 1 && Math.abs(arr[end]) > Math.abs(arr[end + 1])) end++;
                while(end < size - 1 && Math.abs(arr[end]) <= Math.abs(arr[end + 1])) end++;
                int len = end - start + 1;
                count += len * (len + 1) / 2;
                if(start != 0 && start == intermidate) count--;
                else if(intermidate > start) {
                    int len1 = intermidate - start + 1;
                    count -= len1 * (len1 + 1) / 2;
                }
                intermidate = end;
                start = end;
                while(arr[start] == arr[start - 1]) start--;
                end++;
            }
            if(count == 0)
                count += size * (size + 1) / 2;
            
            System.out.println(count);
        }
	}
}




