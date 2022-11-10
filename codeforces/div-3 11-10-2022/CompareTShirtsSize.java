import java.util.Scanner;

/**
 * CompareTShirtsSize
 */
public class CompareTShirtsSize {

    protected static void compareSize(String a, String b){
        if(a.equals(b)) System.out.println("=");
        else if(a.charAt(a.length() - 1) != b .charAt(b.length() - 1)) {
            int last_a =  a.charAt(a.length() - 1);
            int last_b = b.charAt(b.length() - 1);
            if(last_a < last_b) System.out.println(">");
            else if(last_a > last_b) System.out.println("<");
        }
        else if(a.charAt(a.length() - 1) =='S'){
            if(a.length() > b.length()) System.out.println("<");
            else System.err.println(">");
        }
        else if(a.charAt(a.length() - 1) =='L'){
            if(a.length() > b.length()) System.out.println(">");
            else System.err.println("<");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            String a = s.next();
            String b = s.next();
            compareSize(a,b);
            t--;
        }
    }
}