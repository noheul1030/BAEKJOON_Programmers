import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length ; j++){
                if(i != j && answer < numbers[i]*numbers[j]){
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        
        return answer;
    }
}