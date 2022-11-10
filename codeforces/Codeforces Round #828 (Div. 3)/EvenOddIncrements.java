import java.util.HashMap;
import java.util.Scanner;

public class EvenOddIncrements {

    static HashMap<Integer,Long> noOfEvenOdd(int[] arr){
        HashMap<Integer, Long> evenOddSum = new HashMap<>();
        evenOddSum.put(0, 0l);
        evenOddSum.put(1, 0l);
        evenOddSum.put(2, 0l);
        for (int i = 0; i < arr.length; i++) {
            int isodd = arr[i] % 2;
            Long num = evenOddSum.get(isodd) + 1;
            evenOddSum.put(isodd, num);
            Long sum = evenOddSum.get(2) + arr[i];
            evenOddSum.put(2, sum);
        }
        return evenOddSum;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase != 0){
            testcase--;
            int size = s.nextInt();
            int query = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            HashMap<Integer, Long> evenOddSum = noOfEvenOdd(arr);
            while(query != 0){
                query--;
                int oddEven = s.nextInt();
                int addNum = s.nextInt();
                Long noOfEle = evenOddSum.get(oddEven);
                Long sum = evenOddSum.get(2);

                sum = sum + (noOfEle * addNum);
                System.out.println(sum);

                evenOddSum.put(2, sum);

                if(addNum % 2 == 1){
                    evenOddSum.put(oddEven, 0l);
                    noOfEle += evenOddSum.get((oddEven + 1) % 2);
                    evenOddSum.put((oddEven + 1) % 2, noOfEle);
                }
            }
        }
    }
}
