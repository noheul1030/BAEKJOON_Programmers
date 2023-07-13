import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        
        HashMap<String,Integer> map = new HashMap<>();
        
        for(String mapstr : arr){
            map.put(mapstr,map.getOrDefault(mapstr , 0) + 1);
        }
        
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            
            if(map.get(key) == 1) list.add(key);
        }
        Collections.sort(list);
        
       for(String str : list){
           answer += str;
       }
        
        return answer;
    }
}