import java.util.Scanner;

class Codechef
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int palindrome[] = new int[n];
            for (int i = 0; i < n; i++) {
                palindrome[i] = s.nextInt();
            }

            int startingPt = 0, endingPt = n - 1;
            int splitCnt = 0;

            while(startingPt < endingPt){
                if(palindrome[startingPt] == palindrome[endingPt]){
                    startingPt ++;
                    endingPt --;
                }

                else if(palindrome[startingPt] < palindrome[endingPt]){
                    palindrome[endingPt] -= palindrome[startingPt];
                    splitCnt ++;
                    startingPt ++;
                }
                else{//palindrome[startingPt] > palindrome[endingPt]
                    palindrome[startingPt] -= palindrome[endingPt];
                    splitCnt ++;
                    endingPt --;
                }
            }
            System.out.println(splitCnt);
        }
    }
}