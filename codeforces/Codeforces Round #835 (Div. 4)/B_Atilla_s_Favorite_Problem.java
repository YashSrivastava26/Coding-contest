import java.util.Scanner;

/**
 * B_Atilla_s_Favorite_Problem
 */
public class B_Atilla_s_Favorite_Problem {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            
            int n = s.nextInt();
            String st = s.next();
            char max = st.charAt(0);
            for (int i = 1; i < n; i++) {
                char ch= st.charAt(i);
                if(max < ch) max = ch;
            }
            int ans = max - 96;
            System.out.println(ans);
            
        }
    }
}