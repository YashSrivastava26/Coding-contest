import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            String st = s.next();
            boolean flag = true;
            for (int i = 0; i < size / 2; i++) {
                if(st.charAt(i) != st.charAt((size / 2 ) + i)) {
                    flag = false;
                }
            }
            if(flag)System.out.println("Yes");
            else System.out.println("No");
        }
	}
}