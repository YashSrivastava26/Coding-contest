import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            int salary = s.nextInt();
            if(salary > 100) System.out.println(salary - 10);
            else System.out.println(salary);
            t--;
        }
	}
}