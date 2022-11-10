import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeathsBlessing {

    static void solution(ArrayList<ArrayList<Integer>> arr){
        Long time = 0l;
        while(!arr.isEmpty()){
            int minIncrease = Integer.MAX_VALUE, minIncreaseIdx = 0;
            for (int i = 0; i < arr.size(); i++) {
                int increase = 0;
                if(i != 0) increase += arr.get(i).get(1);
                if(i != arr.size() - 1) increase += arr.get(i).get(1);

                if(increase < minIncrease){
                    minIncreaseIdx = i;
                    minIncrease = increase;
                }
            }

            time += arr.get(minIncreaseIdx).get(0);
            if(minIncreaseIdx != 0){
                int value = arr.get(minIncreaseIdx - 1).get(0) + minIncrease;
                arr.get(minIncreaseIdx - 1).set(0, value);
            }

            if(minIncreaseIdx != arr.size() - 1){
                int value = arr.get(minIncreaseIdx + 1).get(0) + minIncrease;
                arr.get(minIncreaseIdx + 1).set(0, value);
            }

            arr.remove(minIncreaseIdx);

        }
        System.out.println(time);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
            int temp[] = new int[size];
            for (int i = 0; i < temp.length; i++) {
                temp[i] = s.nextInt();
            }
            int spellValue = 0;
            for (int i = 0; i < temp.length; i++) {
                spellValue = s.nextInt();
                arr.add(new ArrayList<>(List.of(temp[i], spellValue)));
            }
            
            solution(arr);
        }
    }
}