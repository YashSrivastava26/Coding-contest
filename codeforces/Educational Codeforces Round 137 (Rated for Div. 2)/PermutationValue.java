import java.util.Scanner;

public class PermutationValue {

    static void solution(int size){

        int arr[] = new int[size];
        int min = 1, max = size;
        int i = 0;
        for (i = 0; i < size / 2; i++) {
            if(i == 0){
                arr[i] = min;
                min++;
                arr[size - i - 1] = min;
                min++;
            }
            else{
                arr[size - i - 1] = max;
                max--;
                arr[i] = max;
                max--;
            }
        }
        arr[i] = max;

        if(size % 2 == 0){
            int idx = (size / 2) - 1;
            for (i = 0; i < idx; i++) {
                if(arr[i] > arr[idx]){
                    int temp = arr[idx];
                    arr[idx] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();

            solution(size);
        }
    }
}
