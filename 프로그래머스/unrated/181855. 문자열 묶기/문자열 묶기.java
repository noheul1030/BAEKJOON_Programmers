import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(String str : strArr){
            int len = str.length();
            map.put(len,map.getOrDefault(len,0) + 1);
        }
        
        int maxValue = 0;
        for(int i : map.keySet()){
            if(map.get(i) > maxValue){
                maxValue = map.get(i);
            }
        }
        int answer = maxValue;
        return answer;
    }
}