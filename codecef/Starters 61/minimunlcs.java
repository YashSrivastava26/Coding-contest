import java.util.HashMap;
import java.util.Scanner;

class minimunlcs
{

    static void solution(String a, String b, int n){
        HashMap<Character, Integer> hash1 = new HashMap<>();
        HashMap<Character, Integer> hash2 = new HashMap<>();

        
        for (int i = 0; i < a.length(); i++) {
            Character key = a.charAt(i);
            if(!hash1.containsKey(key)) hash1.put(key, 1);
            else hash1.put(key, hash1.get(key) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            Character key = b.charAt(i);
            if(!hash2.containsKey(key)) hash2.put(key, 1);
            else hash2.put(key, hash2.get(key) + 1);
        }
        int  s = 0; 
        for (char i = 'a'; i <= 'z'; ++i){
            if(hash1.get(i) != null && hash2.get(i) != null)
                s = Math.max(s, Math.min(hash1.get(i), hash2.get(i)));
        }
        System.out.println(s);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while(t != 0){
            t--;
            int size = s.nextInt();
            String s1 = s.next();
            String s2 = s.next();
            solution(s1, s2, size);
        }
	}
}