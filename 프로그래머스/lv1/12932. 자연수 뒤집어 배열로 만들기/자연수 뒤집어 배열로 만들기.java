import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuffer sb = new StringBuffer(str);   
        str = sb.reverse().toString();
        
        int[] answer = new int[str.length()];
        
        int i = 0;
        for(String s : str.split("")){
            answer[i] = Integer.parseInt(s);
            i++;
        }
        return answer;
    }
}