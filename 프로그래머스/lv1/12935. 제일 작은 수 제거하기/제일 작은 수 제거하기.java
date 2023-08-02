import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i : list){
            min = Math.min(min,i);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == min) list.remove(i);
        }
        
        if(list.size() == 0) return new int[]{-1};
        return list.stream().mapToInt(i -> i).toArray();
    }
}