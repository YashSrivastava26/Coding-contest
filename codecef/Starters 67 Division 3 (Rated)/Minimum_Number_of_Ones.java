import java.util.Scanner;
/**
 * Minimum_Number_of_Ones
 */
public class Minimum_Number_of_Ones {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            int n = s.nextInt();
            System.out.println((int) n / 2);
        }
    }
}

