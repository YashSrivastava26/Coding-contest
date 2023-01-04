import java.util.Scanner;

/**
 * Prime_Reversal
 */
class Prime_Reversal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            String st1 = s.next();
            String st2 = s.next();
            int noOf1_in_1 = 0;
            int noOf1_in_2 = 0;

            for (int i = 0; i < n; i++) {
                char ch1 = st1.charAt(i);
                char ch2 = st2.charAt(i);

                if(ch1 == '1'){
                    noOf1_in_1++;
                }
                if(ch2 == '1'){
                    noOf1_in_2++;
                }
            }

            if(noOf1_in_1 == noOf1_in_2) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
