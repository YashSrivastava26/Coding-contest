import java.util.Scanner;

/**
 * C_Advantage
 */
public class C_Advantage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            
            int n = s.nextInt();
            int arr[] = new int[n];
            arr[0] = s.nextInt();
            int maxi = arr[0];
            int secondMaxi = Integer.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                arr[i] = s.nextInt();
                if(arr[i] > maxi){
                    secondMaxi = maxi;
                    maxi = arr[i];
                }
                else if(arr[i] > secondMaxi){
                    secondMaxi = arr[i];
                }
            }
            
            if(n == 2) System.out.println((arr[0] - arr[1]) + " " + (arr[1] - arr[0]));
            else{
                for (int i = 0; i < n; i++) {
                    if(arr[i] != maxi){
                        System.out.print((arr[i] - maxi) + " ");
                    }
                    else{
                        System.out.print((maxi - secondMaxi) + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}