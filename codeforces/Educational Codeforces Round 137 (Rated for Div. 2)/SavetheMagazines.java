import java.util.Scanner;

/**
 * SavetheMagazines
 */
public class SavetheMagazines {

    static void solution(int size, int[][] arr){
        int save = 0;
        if(arr[0][0] == 49) save += arr[1][0];
        for (int i = 1; i < size; i++) {
            if(arr[0][i] == 49){
                if(arr[0][i - 1] == 48 && arr[1][i - 1] >= arr[1][i]){
                    save += arr[1][i - 1];
                    arr[0][i] = 48;
                    arr[0][i - 1] = 49;
                }
                else save += arr[1][i];
            }
        }
        System.out.println(save);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            int arr[][] = new int[2][size];
            String lid = s.next();
            for (int i = 0; i < size; i++) {
                arr[0][i] =lid.charAt(i);
                arr[1][i] = s.nextInt();
            }
            solution(size, arr);
        }
    }
}
