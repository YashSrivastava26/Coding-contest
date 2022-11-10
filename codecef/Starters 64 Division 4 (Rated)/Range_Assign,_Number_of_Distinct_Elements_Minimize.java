import java.util.HashMap;
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
            HashMap<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < size; i++) {
                arr[i] = s.nextInt();
                mp.put(arr[i], i);
            }
            int ptr1 = 0 ,ptr2 = 0;
            while(ptr1 < size){
                int ele = arr[ptr1];
                ptr2 = mp.get(ele);
                while(ptr1 <= ptr2){
                    arr[ptr1] = ele;
                    ptr1++;
                }
            }
            int ele1 = 0, ele2 = 0;
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if(ele1 == 0) ele1 = arr[i];
                else if(arr[i] != ele1 && ele2 == 0) ele2 = arr[i];
                else if(arr[i] != ele1 && arr[i] != ele2) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println("yes");
            else System.out.println("no");
        }
	}
}