import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch)){
                answer+= Integer.parseInt(String.valueOf(ch));
            }
        }
        return answer;
    }
}