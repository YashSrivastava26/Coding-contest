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
            int ele;
            int count1 = 0, count2 = 0, count3 = 0;
            int sol = 0;
            for (int i = 0; i < size; i++) {
                ele = s.nextInt();
                if(ele == 0) count1++;
                else if(ele == 1) count2++;
                count3 = Math.min(count1, count2);
                count1 -= count3;
                count2 -= count3;
                sol += count3;
            }
            int solution = sol + count2 / 3;
            System.out.println(solution);
        }
	}
}