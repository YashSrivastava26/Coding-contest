
import java.util.*;

/**
 * C_Thermostat
 */
public class C_Thermostat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int l = s.nextInt();
            int r = s.nextInt();
            int x = s.nextInt();

            int a = s.nextInt();
            int b = s.nextInt();


            if(b < l || b > r) {
                System.out.println("-1");
                continue;
            }
            
            int a_l = Math.abs(a - l);
            int a_r = Math.abs(a - r);
            int b_l = Math.abs(b - l);
            int b_r = Math.abs(b - r);
            if(a == b) System.out.println("0");
            else if(Math.abs(b - a) >= x) {
                System.out.println("1");
            }
            else if((b_l < x && b_r < x) || (a_l < x && a_r < x)){
                System.out.println("-1");
            }
            else{
                if(a_l < x){
                    if(b_r >= x){
                        System.out.println("2");
                    }
                    else{
                        System.out.println("3");
                    }
                }
                else if(a_r < x){
                    if(b_l >= x){
                        System.out.println("2");
                    }
                    else{
                        System.out.println("3");
                    }
                }
                else{
                    System.out.println("2");
                }
            }
            
        }
    }
    
}