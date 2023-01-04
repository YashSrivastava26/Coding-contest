import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * A_Medium_Number
 */
public class A_Medium_Number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(a);
            arr.add(b);
            arr.add(c);

            Collections.sort(arr);
            System.out.println(arr.get(1));
        }
    }
}