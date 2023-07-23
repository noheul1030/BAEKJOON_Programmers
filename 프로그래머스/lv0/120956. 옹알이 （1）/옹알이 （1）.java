import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++){
            for(String s : str){
                babbling[i] = babbling[i].replace(s," ").trim();
            }
        }
        int answer = (int)Arrays.stream(babbling).filter(i -> i.isEmpty()).count();
        return answer;
    }
}