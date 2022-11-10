import java.util.Scanner;

class MinimumAbsoluteScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            String st1 = s.next(), st2 = s.next();
            long score = 0;
            for (int i = 0; i < n; i++) {

                if(st1.charAt(i) > st2.charAt(i)){
                    int add = 26 - (st1.charAt(i) - st2.charAt(i));
                    score += add;
                }
                else {
                    int add = st2.charAt(i) - st1.charAt(i);
                    score += add;
                }
            }
            
            score = Math.min(Math.abs(score % 26 - 26), Math.abs(score % 26));
            System.out.println(score);
        }
	}
}
