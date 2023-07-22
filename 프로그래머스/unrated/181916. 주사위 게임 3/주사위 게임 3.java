import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(a, map.getOrDefault(a,0) + 1);
        map.put(b, map.getOrDefault(b,0) + 1);
        map.put(c, map.getOrDefault(c,0) + 1);
        map.put(d, map.getOrDefault(d,0) + 1);
        
        int mapSize = map.size();
        
        if(mapSize == 1){
            answer = 1111 * a;
        }
        else if(mapSize == 2) {
            int a2 = 0;
            int b2 = 0;
            List<Integer> list = new ArrayList<>();
            for(Integer i : map.keySet()){
                if(map.get(i) == 3) a2 = i;
                else b2 = i;
                
                if(map.get(i) == 2) list.add(i);
            }
            
            int a22 = (10 * a2) + b2;
            if(a2 != 0) answer = a22 * a22;
            else answer = (list.get(0) + list.get(1)) * Math.abs(list.get(0) - list.get(1));
        }
        else if(mapSize == 3){
            List<Integer> list = new ArrayList<>();
            for(Integer i : map.keySet()){
                if(map.get(i) == 1) list.add(i);
            }
            answer = list.get(0) * list.get(1);
        }
        else {
            int min = 7;
            int[] n = {a,b,c,d};
            for(int i : n){
                if(min > i) min = i;
            }
            answer = min;
        }
        
        return answer;
    }
}