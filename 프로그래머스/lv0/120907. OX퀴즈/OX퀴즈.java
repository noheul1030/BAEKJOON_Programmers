import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        int cnt = 0;
        for(String q : quiz){
            String[] str = q.split(" ");    
            if(str[1].equals("-")){
                if(Integer.parseInt(str[0])-Integer.parseInt(str[2]) == Integer.parseInt(str[4])) answer[cnt] = "O";
                else answer[cnt] = "X";
            }else if(str[1].equals("+")){
                if(Integer.parseInt(str[0])+Integer.parseInt(str[2]) == Integer.parseInt(str[4])) answer[cnt] = "O";
                else answer[cnt] = "X";
            }
            cnt++;
        }
        return answer;
    }
}