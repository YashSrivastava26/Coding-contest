import java.util.HashMap;
import java.util.Scanner;

public class NumberReplacement {

    static void solution(int[] arr, String replacenemt){
        HashMap<Integer,Character> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey(arr[i])){
                if(hash.get(arr[i]) != replacenemt.charAt(i)){
                    System.out.println("NO");
                    return;
                }
            }
            else{
                hash.put(arr[i], replacenemt.charAt(i));
            }
        }
        System.out.println("YES");
        return;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase != 0){
            testcase--;
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            String replacenemt = s.next();
            solution(arr,replacenemt);
        }
    }
}