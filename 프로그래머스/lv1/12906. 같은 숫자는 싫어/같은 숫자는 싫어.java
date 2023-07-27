import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i : arr){
            if(s.peek()!= null && s.peek()!=i){
                s.push(i);
            }            
        }
        int cnt = s.size();
        int[] answer = new int[cnt];
        
        for(int i = cnt-1; i >= 0; i--){
            answer[i] = s.pop();
        }
        

        return answer;
    }
}