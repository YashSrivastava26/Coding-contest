import java.util.Scanner;
class SortedSubstrings
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int size = s.nextInt();
            String st = s.next();
            int count = 0;
            for (int i = 0; i < size - 1; i++) {
                if(st.charAt(i) > st.charAt(i + 1)) count++;
            }
            System.out.println(count);

        }      
	}
}