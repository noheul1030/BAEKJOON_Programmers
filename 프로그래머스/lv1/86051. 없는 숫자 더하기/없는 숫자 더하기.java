import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : numbers){
            list.add(i);
        }
        for(int i = 0; i <= 9; i++){
            if(!list.contains(i))
                answer += i;
        }
        return answer; 
    }
}