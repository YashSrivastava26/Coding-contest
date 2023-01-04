import java.util.Scanner;

class Codechef
{
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t-- != 0){
            String binaryString = s.next();
            int no_0_1 = 0, no_1_0 = 0;
            int n = binaryString.length();

            for (int i = 0; i < n - 1; i++) {
                if(binaryString.charAt(i) == '1' && binaryString.charAt(i + 1) == '0'){
                    no_1_0++;
                }
                else if(binaryString.charAt(i) == '0' && binaryString.charAt(i + 1) == '1'){
                    no_0_1++;
                }
            }

            int temp_1_0 = no_1_0, temp_0_1 = no_0_1;

            int ans = 0;
            for (int i = 0; i < n; i++) {
                no_1_0 = temp_1_0;
                no_0_1 = temp_0_1;

                if(binaryString.charAt(i) == '1')
                {
                    if(i == 0) 
                    {
                        if(binaryString.charAt(i+1) == '1') {
                            no_0_1++;
                        }
                        else no_1_0--;
                    }
                    else if(i == n - 1)
                    {
                        if(binaryString.charAt(i-1) == '1') {
                            no_1_0++;
                        }
                        else {
                            no_0_1--;
                        }
                    }
                    else 
                    {
                        if(binaryString.charAt(i-1) == '1') {
                            no_1_0++;
                        }
                        else {
                            no_0_1--;
                        }
                        if(binaryString.charAt(i+1) == '1') {
                            no_0_1++;
                        }
                        else {
                            no_1_0--;
                        }
                    }
                }
                else 
                {
                    if(i == 0) 
                    {
                        if(binaryString.charAt(i+1) == '0') {
                            no_1_0++;
                        }
                        else {
                            no_0_1--;
                        }
                    }
                    else if(i == n - 1)
                    {
                        if(binaryString.charAt(i-1) == '0') {
                            no_0_1++;
                        }
                        else {
                            no_1_0--;
                        }
                    }
                    else 
                    {
                        if(binaryString.charAt(i+1) == '0') {
                            no_1_0++;
                        }
                        else {
                            no_0_1--;
                        }
                        if(binaryString.charAt(i-1) == '0') {
                            no_0_1++;
                        }
                        else no_1_0--;
                    }
                }

                if(no_0_1 == no_1_0) ans++;
            }

            System.out.println(ans);
        }
    }
}

