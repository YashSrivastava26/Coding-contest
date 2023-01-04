import java.util.*;

/**
 * Maximum_Angriness
 */
class Maximum_Angriness {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            long n = s.nextLong();
            long time = s.nextLong();

            long halfSize = (n / 2);
            long normalAns = (n * (n - 1)) / 2;
            if(time >= halfSize) System.out.println(normalAns);
            else{
                long extra = (n - 2 * time) * time;
                long ans = ((n - 1) * time) + extra;
                System.out.println(ans);
            }
            
        }
    }
}