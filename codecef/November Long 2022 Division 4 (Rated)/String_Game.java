import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            String st = s.next();
            Set < Character > set = new HashSet<>();
            for (int i = 0; i < size; i++) {
                char ch = st.charAt(i);
                if(set.contains(ch)) set.remove(ch);
                else set.add(ch);
            }
            if(set.size() == 0) System.out.println("yes");
            else System.out.println("no");
        }
	}
}