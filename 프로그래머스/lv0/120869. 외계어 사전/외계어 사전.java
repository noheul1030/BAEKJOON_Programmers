import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        for(String d : dic){
            int check = 0;
            for(int i = 0; i < spell.length; i++){
                if(d.indexOf(spell[i])==-1){
                    check = -1;
                    answer = 2;
                    break;
                }
            }
            if(check == 0){
                answer =1;
                break;
            }
        }
        return answer;
    }
    
}