import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        int check = 0;
        for(int i = 0; i < dic.length; i++){
            for(String s : spell){
                if(dic[i].contains(s)) check++;
            }
            if(check == spell.length) return 1;
            
            check = 0;
        }
        return answer;
    }
}