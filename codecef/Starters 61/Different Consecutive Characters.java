import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            String st = s.next();
            int count = 0;
            for (int i = 1; i < st.length(); i++) {
                if(st.charAt(i) == st.charAt(i - 1)) count++;
            }
            System.out.println(count);
        }
	}
}
