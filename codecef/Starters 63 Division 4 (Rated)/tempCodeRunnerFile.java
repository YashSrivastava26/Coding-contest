class MinimumAbsoluteScore
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            String st1 = s.next(), st2 = s.next();
            int score = 0;
            for (int i = 0; i < n; i++) {
                int charA = st1.charAt(i), charB = st2.charAt(i);
                if(charA == charB) continue;
                else{
                    int q = Math.abs(charB - charA);
                    if(q > 13) q = q - 26;
                    score += q;
                }
            }
            System.out.println(score);
        }
	}
}