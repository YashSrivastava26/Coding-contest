import java.util.*;

/**
 * template
 */
class template {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            
            if(a == b + c || b == a + c || c == b + a) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}