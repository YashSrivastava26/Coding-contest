import java.util.Scanner;

class Minimize_swaps
{
    static void solution(String st){
        int size = st.length();
        int evenPlaceOnes = 0, oddPlaceOnes = 0;

        for (int i = 0; i < size; i++) {
            if(st.charAt(i) == '1'){
                if((i & 1) == 0) evenPlaceOnes++;
                else oddPlaceOnes++;
            }
        }
        if(Math.abs(oddPlaceOnes - evenPlaceOnes) % 3 == 0){
            System.out.println("0");
            return;
        }
        else{
            int freq = 0;
            for (int i = 1; i < size; i++) {
                if(st.charAt(i) != st.charAt(i - 1))
                    freq++;
            }

            if(freq == 1){
                for (int i = 1; i < size; i++) {
                    if( ((i % 2) == 1 || ((size - i) % 2) == 1) && st.charAt(i) != st.charAt(i - 1) && i != 1 && i != size - 1){
                        System.out.println("3");
                        return;
                    }
                }
            }

            if(Math.abs(oddPlaceOnes - evenPlaceOnes) % 3 == 2){
                if(oddPlaceOnes + evenPlaceOnes == size) System.out.println("-1");
                else System.out.println("1");
            }
            else{
                if(oddPlaceOnes + evenPlaceOnes > size - 1)
                    System.out.println("-1");
                else{
                    boolean flag = false;
                    
                    for (int i = 0; i < size; i++) {
                        if(evenPlaceOnes > oddPlaceOnes){
                            if(i % 2 != 0 && st.charAt(i) == '1'){
                                if(i - 1 >= 0 && st.charAt(i - 1) == '0'){
                                    flag = true;
                                    break;
                                }
                                else if(i + 1 < size && st.charAt(i + 1) == '0'){
                                    flag = true;
                                    break;
                                }
                            }

                        }
                        else{
                            if(i % 2 == 0 && st.charAt(i) == '1'){
                                if(i - 1 >= 0 && st.charAt(i - 1) == '0'){
                                    flag = true;
                                    break;
                                }
                                else if(i + 1 < size && st.charAt(i + 1) == '0'){
                                    flag = true;
                                    break;
                                }
                            } 
                        }
                    }


                    if(flag) System.out.println("1");
                    
                    else{
                        if(oddPlaceOnes + evenPlaceOnes == size - 1){
                            System.out.println("-1");
                        }
                        else{
                            if(oddPlaceOnes > evenPlaceOnes){
                                int cnt = 0;
                                for (int i = 0; i < size; i++) {
                                    if(i % 2 == 0) cnt++;
                                }

                                if(oddPlaceOnes < 2 || cnt < 2) System.out.println("-1");
                                else System.out.println("2");

                            }
                            else{
                                int cnt = 0;
                                for (int i = 0; i < size; i++) {
                                    if(i % 2 != 0) cnt++;
                                }

                                if(evenPlaceOnes < 2 || cnt < 2) System.out.println("-1");
                                else System.out.println("2");
                            }
                        }
                    }

                }
            }
        }

    }


	public static void main (String[] args) 
	{
        
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- != 0){
            String st = s.next();
            solution(st);
        }
	}
}