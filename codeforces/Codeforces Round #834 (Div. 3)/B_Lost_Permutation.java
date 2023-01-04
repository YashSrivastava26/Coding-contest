
import java.util.*;

/**
 * B_Lost_Permutation
 */
public class B_Lost_Permutation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int size = s.nextInt();
            int sum = s.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            HashMap<Integer, Integer> hMap= new HashMap<>();
            int maxi = 0;
            boolean flag = true;

            for (int i = 0; i < size; i++) {
                int ele = s.nextInt();
                arr.add(ele);
                if(hMap.containsKey(ele)) {
                    flag = false;
                    break;
                }
                else{
                    hMap.put(ele, 1);
                    maxi = Math.max(maxi, ele);
                }
            }
            if(flag == false){
                System.out.println("No");
                continue;
            }
            int addEle = 0;
            while(sum > 0){
                addEle++;
                if(!hMap.containsKey(addEle)) {
                    sum -= addEle;
                    arr.add(addEle);
                }
            }
            

            if(sum != 0){ 
                System.out.println("No");
                continue;
            }
            Collections.sort(arr);
            boolean flg2 = true;
            for (int i = 1; i < arr.size(); i++) {
                if(arr.get(i) != arr.get(i - 1) + 1) {
                    flg2 = false;
                    break;
                }
            }
            if(flg2) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}