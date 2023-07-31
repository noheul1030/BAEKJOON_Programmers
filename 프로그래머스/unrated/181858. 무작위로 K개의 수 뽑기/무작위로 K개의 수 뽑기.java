import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[k];
        Arrays.fill(answer,-1);
        
        for(int a : arr){
            if(!list.contains(a)) list.add(a);
        }
        
        System.out.println("list : " + list);
        
        for(int i = 0; i < k; i++){
            if(list.size() > i) answer[i] = list.get(i);    
        }
        return answer;
    }
}