import java.util.*;
class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0) list.add(i); 
        }
        int answer = 0;
        
        for(int i : list){
            answer+= i;
        }
        return answer;
    }
}