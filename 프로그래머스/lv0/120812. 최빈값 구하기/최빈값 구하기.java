import java.util.*;
class Solution {
    public int solution(int[] array) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : array){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int max = 0;
        int key = 0;
        for(int m : map.keySet()){
            if(map.get(m) > max){
                max = map.get(m);
                key = m;
            }
        }
        
        int count = 0;
        for(int m : map.keySet()){
            if(map.get(m) == max) count++;
        }

        return count >= 2 ? -1 : key;
    }
}