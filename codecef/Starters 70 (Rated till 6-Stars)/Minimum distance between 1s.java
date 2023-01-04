import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Minimum distance between 1s
 */
class Minimum_distance_between_1s {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            String st = s.next();
            
            
            boolean oddPlace1 = false;
            boolean evenPlace1 = false;

            for (int i = 0; i < n; i++) {
                char ch = st.charAt(i);
                if(ch == '1'){
                    if(i % 2 == 0) evenPlace1 = true;
                    else oddPlace1 = true;
                }
            }
            if(oddPlace1 && evenPlace1)System.out.println("1");
            else System.out.println("2");
                        
        }
    }
    
}
