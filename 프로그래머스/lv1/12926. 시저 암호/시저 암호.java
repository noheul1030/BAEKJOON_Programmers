import java.util.*;
class Solution {
    public String solution(String s, int n) {
        List<Character> lower = new ArrayList<>();
        List<Character> upper = new ArrayList<>();
        for(int i = (int)'a'; i <= (int)'z'; i++){
            lower.add((char)i);
        }
        for(int i = (int)'A'; i <= (int)'Z'; i++){
            upper.add((char)i);
        } 
        
        String answer = "";
        
        for(Character c : s.toCharArray()){
            if(Character.isLowerCase(c)){
                int lowIndex = (lower.indexOf(c) + n) % lower.size();
                answer += lower.get(lowIndex);
            }else if(Character.isUpperCase(c)){
                int upIndex = (upper.indexOf(c) + n) % upper.size();
                answer += upper.get(upIndex);
            }else{
                answer += " ";
            }
        }
        
        return answer;
    }
}