import java.util.Scanner;

class Minimize_swaps
{
    static boolean checkDivBy3(int evenOnes, int oddOnes){
        if((evenOnes - oddOnes) % 3 == 0 || (oddOnes - evenOnes) % 3 == 0) return true;
        else return false;
    }
	public static void main (String[] args) 
	{
        
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            String st = s.next();
            int evenPlaceOnes = 0;
            int oddPlaceOnes = 0;
            int evenPlaceZeros = 0;
            int oddPlaceZeros = 0;
            for (int i = 0; i < st.length(); i++) {
                if(st.charAt(i) == '1'){
                    if(i % 2 == 0) evenPlaceOnes++;
                    else oddPlaceOnes++;
                }
                if(st.charAt(i) == '0'){
                    if(i % 2 == 0) evenPlaceZeros++;
                    else oddPlaceZeros++;
                }
            }
            if(checkDivBy3(evenPlaceOnes, oddPlaceOnes)) System.out.println("0");

            else if(evenPlaceZeros >= 1 && oddPlaceOnes >= 1 && checkDivBy3(evenPlaceOnes + 1, oddPlaceOnes - 1)) System.out.println("1");
            else if(oddPlaceZeros >= 1 && evenPlaceOnes >= 1 && checkDivBy3(evenPlaceOnes - 1, oddPlaceOnes + 1)) System.out.println("1");

            else if(evenPlaceZeros >= 2 && oddPlaceOnes >= 2 && checkDivBy3(evenPlaceOnes + 2, oddPlaceOnes - 2)) System.out.println("2");
            else if(oddPlaceZeros >= 2 && evenPlaceOnes >= 2 && checkDivBy3(evenPlaceOnes - 2, oddPlaceOnes + 2)) System.out.println("2");
            
            else if(evenPlaceZeros >= 3 && oddPlaceOnes >= 3 && checkDivBy3(evenPlaceOnes + 3, oddPlaceOnes - 3)) System.out.println("3");
            else if(oddPlaceZeros >= 3 && evenPlaceOnes >= 3 && checkDivBy3(evenPlaceOnes - 3, oddPlaceOnes + 3)) System.out.println("3");

            else if(evenPlaceZeros >= 4 && oddPlaceOnes >= 4 && checkDivBy3(evenPlaceOnes + 4, oddPlaceOnes - 4)) System.out.println("4");
            else if(oddPlaceZeros >= 4 && evenPlaceOnes >= 4 && checkDivBy3(evenPlaceOnes - 4, oddPlaceOnes + 4)) System.out.println("4");

            else if(evenPlaceZeros >= 5 && oddPlaceOnes >= 5 && checkDivBy3(evenPlaceOnes + 5, oddPlaceOnes - 5)) System.out.println("5");
            else if(oddPlaceZeros >= 5 && evenPlaceOnes >= 5 && checkDivBy3(evenPlaceOnes - 5, oddPlaceOnes + 5)) System.out.println("5");

            else if(evenPlaceZeros >= 6 && oddPlaceOnes >= 6 && checkDivBy3(evenPlaceOnes + 6, oddPlaceOnes - 6)) System.out.println("6");
            else if(oddPlaceZeros >= 6 && evenPlaceOnes >= 6 && checkDivBy3(evenPlaceOnes - 6, oddPlaceOnes + 6)) System.out.println("6");

            else System.out.println("-1");
            
            
        }
	}
}
