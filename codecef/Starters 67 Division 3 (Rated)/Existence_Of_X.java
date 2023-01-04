import java.util.*;
/**
 * Existence_Of_X
 */
class Existence_Of_X {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            int check = 0;
            boolean flg = false;
            do{
                int lhs = (a ^ check) + (b ^ check);
                int rhs = c ^ check;
                if(lhs == rhs){
                    flg = true;
                    System.out.println("YES");
                }
                check++;
            }while(check < 5 && !flg);

            if(check == 5) System.out.println("NO");
        }
    }
    
}