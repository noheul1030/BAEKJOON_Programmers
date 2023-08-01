import java.util.*;
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String str : s.split("")){
            map.put(str,map.getOrDefault(str,0) + 1);
        }
        boolean answer = true;
        
        if(map.get("p") == map.get("y")) answer = true;
        else answer = false;
        return answer;
    }
}