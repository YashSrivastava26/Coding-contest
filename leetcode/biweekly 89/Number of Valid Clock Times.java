class Solution {
    public int countTime(String time) {
        int combination = 1;
        if(time.charAt(0) == '?' && time.charAt(1) == '?') combination *= 24;
        else if(time.charAt(0) == '?'){
            if(time.charAt(1) > '4') combination *= 2;
            else combination *= 3;
        }
        else if(time.charAt(1) == '?'){
            if(time.charAt(0) == 2) combination *= 4;
            else combination *= 10;
        }
        if(time.charAt(3) == '?') combination *= 6;
        if(time.charAt(4) == '?') combination *= 10;
        if(time.charAt(4) != '?' && time.charAt(3) != '?' && time.charAt(1) != '?' && time.charAt(0) != '?') return 0;
        return combination;
    }
}