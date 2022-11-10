import java.util.Scanner;

/**
 * TechnicalSupport
 */
public class TechnicalSupport {

    static void solution(String st, int size){
        int count = 0, i = size - 1;
        while(i >= 0){
            if(st.charAt(i) == 'Q') count--;
            if(st.charAt(i) == 'A') count++;
            if(count < 0){
                System.out.println("No");
                return;
            }
            i--;
        }
        System.out.println("Yes");

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            String st = s.next();
            solution(st, size);
        }
    }
}