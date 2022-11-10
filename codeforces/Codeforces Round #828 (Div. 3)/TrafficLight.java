import java.util.Scanner;

public class TrafficLight {

    static void solution(String pattern, char currState, int size){
        int maxi = -1;
        if(currState == 'g'){
            System.err.println("0");
        }
        else{
            for (int i = 0; i < size; i++) {
                if(pattern.charAt(i) == currState){
                    int j = i + 1, currwait = 1;
                    if(j == size){
                        j = 0;
                    }
                    while(j != i && pattern.charAt(j % pattern.length()) != 'g' && j < 2 * pattern.length()){
                        j++;
                        currwait++;
                    }
                    //if(maxi != -1)
                        maxi = Math.max(maxi, currwait);
                }
            }
        // if(maxi != -1)
             System.out.println(maxi);
        //else
            //System.out.println("cannot cross road");
        }
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int testcase = s.nextInt();
        while(testcase != 0){
            testcase--;
            int size = s.nextInt();
            char currState = s.next().charAt(0);
            String pattern = s.next();
            solution(pattern, currState, size);
        }
    }
}
