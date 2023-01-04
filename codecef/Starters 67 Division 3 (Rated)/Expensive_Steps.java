import java.util.*;
/**
 * Expensive_Steps
 */
class Expensive_Steps {

    static boolean isOutside(int x, int y, int n){
        if(x < 1 || x > n || y > n || y < 1) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t -- != 0){
            int n = s.nextInt();
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            if(isOutside(x1, y1, n) && isOutside(x2, y2, n)){
                System.out.println("0");
                continue;
            }
            else if(!isOutside(x1, y1, n) && isOutside(x2, y2, n)){
                int outsideLength = Math.min(Math.min(x1, y1), Math.min(n - x1 + 1,n - y1 + 1));
                System.out.println(outsideLength);
                continue;
            }
            else if(isOutside(x1, y1, n) && !isOutside(x2, y2, n)){
                int outsideLength = Math.min(Math.min(x2, y2), Math.min(n - x2 + 1,n - y2 + 1));
                System.out.println(outsideLength);
                continue;
            }
            else{
                int nomralPathLength = Math.abs(x1 - x2) + Math.abs(y1 - y2);
                int outsideLength = Math.min(Math.min(x1, y1), Math.min(n - x1 + 1,n - y1 + 1)) + 0 + Math.min(Math.min(x2, y2), Math.min(n - x2 + 1,n - y2 + 1));
                System.out.println(Math.min(nomralPathLength, outsideLength));
            }
            
        }
    }
}