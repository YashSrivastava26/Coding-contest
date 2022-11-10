import java.util.ArrayList;
import java.util.Scanner;

class Codechef
{

    public static  int solution(int idx, int idx2, int[] arr, int count){
        if(idx2 == arr.length) return count;
        int ret = Integer.MAX_VALUE;
        int x = arr[idx], y = arr[idx2] , currsize = 0;
        if(x <= (1 ^ y)){
            solution(idx + 1, idx2 + 1, arr, count);
            vis[idx] = vis[idx2] = 1;
        }
        else{
            vis[idx2] = 1;
            vis[idx] = 0;
            solution(idx + 1, idx2 + 1, arr, vis, count + 1);

            vis[idx] = 1;
            vis[idx2] = 0;
            solution(idx, idx2 + 1, arr, vis, count + 1);
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt(); 
            int arr[] = new int[n];
            int vis[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            solution(0, 1, arr, vis);
            int count = 0;
            for (int i = 0; i < vis.length; i++) {
                if(vis[i] == 1) count++;
            }
            System.out.println(count);
        }
	}
}


