import java.util.Scanner;

/**
 * A_Yes-Yes
 */
public class A_Yes_Yes {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            String st = s.next();
            int len = st.length();
            int add = 0; 
            char chk[] = {'Y', 'e' , 's'};
            boolean flag = true;
            int startChar = st.charAt(0);
            if(startChar == 'Y') add = 0;
            else if(startChar == 'e') add = 1;
            else if(startChar == 's') add = 2;
            else{
                flag = false;
            }

            if(flag){
                for (int i = 0; i < len; i++) {
                    int idx = (i + add) % 3;
                    if(st.charAt(i) != chk[idx]){
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}