import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        Iterator<Integer> iter = set.iterator();
        int[] answer = new int[set.size()];
        int cnt = 0;
        while(iter.hasNext()){
            answer[cnt] = iter.next();
            cnt++;
        }
        return answer;
    }
}