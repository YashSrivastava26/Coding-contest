import java.util.Scanner;

class Codechef
{

    static boolean solution(int a, int b){
        if(a == b) return true;
        if(a <= b / 2) return true;
        return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int a = s.nextInt(), b = s.nextInt();
            if(solution(a, b)) System.out.println("Yes");
            else System.out.println("NO");
        }       
	}
}