import java.util.Scanner;

class Codechef
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            int x = s.nextInt();

            long daysInGrp = (k * n) + m;

            long dayTillMob = n * (k - 1);
            long makeInGrp = x % (daysInGrp);
            if(makeInGrp == 0 || makeInGrp - dayTillMob > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}