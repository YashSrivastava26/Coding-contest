import java.util.Arrays;
import java.util.Scanner;

class Solution{
    public void insert(String[] color, int[] durability, int[] id){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < id.length; i++) {
            color[i] = s.next();
            durability[i] = s.nextInt();
            id[i] = s.nextInt();
        }
    }

    public int solution(String[] color, int[] durability, int[] id){
        String color2[] = color;
        int durability2[] = durability;
        Arrays.sort(color2);
        Arrays.sort(durability2);
        int count = 0;
        for (int i = 0; i < durability2.length; i++) {
            for (int j = 0; j < durability2.length; j++) {
                if(durability2[i] == durability[j] && color2[i] == color[j])
                    count ++;
            }
        }
        return count;
    }

}


public class SortOfFabrics {
    public static void main(String[] args) {
        int t;
        Solution sol = new Solution();
        Scanner s =new Scanner(System.in);
        t = s.nextInt();
        int result[] = new int[t];
        for (int i = 0; i < t; i++) {
            int size = s.nextInt();
            String color[] = new String[size];
            int durability[] = new int[size];
            int id[] = new int[size];
            sol.insert(color, durability, id);

            result[i] = sol.solution(color, durability, id);

        }
    }
}