import java.util.*;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0) answer.add(i);
        }
        Collections.sort(answer);
        return answer;
    }
}