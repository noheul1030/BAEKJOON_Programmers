import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        int i = 0;        
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch) == true)  i++;
        }
        int[] answer = new int[i];
        
        i = 0;
        for(char ch : my_string.toCharArray()){
            if(Character.isDigit(ch) == true){
                answer[i] = Integer.parseInt(String.valueOf(ch));
                i++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
} 