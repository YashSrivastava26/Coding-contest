import java.util.ArrayList;
import java.util.Scanner;

class Codechef
{
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;

        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void divisors(int n, ArrayList<Integer> divisor){
        for (int i=1; i<=Math.sqrt(n); i++){
            if (n%i==0){
                if(isPrime(i)){
                    divisor.add(i);
                }
                if (n/i != i) {                
                    if(isPrime(n / i)){
                        divisor.add(n / i);   
                    }
                }
            }
        }
    }

    public static long lcm_of_list_elements(ArrayList<Integer> element_array)
    {
        long lcm_of_array_elements = 1;
        int divisor = 2;
         
        while (true) {
            int counter = 0;
            boolean divisible = false;
             
            for (int i = 0; i < element_array.size(); i++) {
 
                if (element_array.get(i) == 0) {
                    return 0;
                }
                else if (element_array.get(i) < 0) {
                    element_array.set(i, element_array.get(i) * (-1));
                }
                if (element_array.get(i) == 1) {
                    counter++;
                }

                if (element_array.get(i) % divisor == 0) {
                    divisible = true;
                    element_array.set(i, element_array.get(i) / divisor);
                }
            }

            if (divisible) {
                lcm_of_array_elements = lcm_of_array_elements * divisor;
            }
            else {
                divisor++;
            }

            if (counter == element_array.size()) {
                return lcm_of_array_elements;
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            int a = s.nextInt();
            int b = s.nextInt();
            
            ArrayList<Integer> divisor = new ArrayList<>();
            divisors(b, divisor);
            // for (int i = 0; i < divisor.size(); i++) {
            //     System.out.println(divisor.get(i));
            // }
            long ansDiv = lcm_of_list_elements(divisor);
            if(a % ansDiv == 0) System.out.println("yes");
            else System.out.println("no");
            

        }
    }
}