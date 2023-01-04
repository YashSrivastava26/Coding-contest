import java.util.*;

/**
 * template
 */
class Pet_Store {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            HashMap < Integer , Integer > type = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int temp = s.nextInt();
                type.put(temp, type.getOrDefault(temp, 0) + 1);
            }

            boolean flg = true;
            for (Integer it : type.values()) {
                if(it % 2 != 0){
                    flg = false;
                    break;
                }
            }

            if(flg) System.out.println("YES");
            else System.out.println("NO");
            
        }
    }
}