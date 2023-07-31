import java.util.*;
class Solution {
    public String[] solution(String mystring) {
        String[] answer = new String[mystring.length()];
        
        for(int i = 0; i < mystring.length(); i++){
            answer[i] = mystring.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}