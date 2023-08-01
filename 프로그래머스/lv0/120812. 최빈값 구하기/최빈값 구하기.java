import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : array){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int max = 0;
        int answer = 0;

        for(int key : map.keySet()){
            if(max < map.get(key)){
                max = map.get(key);
                answer = key;
            } else if(max == map.get(key)){
                answer = -1;
            }
        }
        return answer;
    }
}