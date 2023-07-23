import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            for(int i = 0; i < a; i++){
                list.add(a);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}