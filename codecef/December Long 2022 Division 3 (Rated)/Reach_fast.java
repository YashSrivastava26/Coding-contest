import java.util.Scanner;

/**
 * Reach_fast
 */
class Reach_fast {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            double x = s.nextInt();
            double y = s.nextInt();
            int k = s.nextInt();

            int steps = (int)Math.ceil((Math.abs(x - y)) / k);
            System.out.println(steps);
        }
    }
}