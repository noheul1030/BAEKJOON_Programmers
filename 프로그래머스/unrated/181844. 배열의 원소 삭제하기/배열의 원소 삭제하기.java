import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        for(int d : delete_list){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] == d) arr[i] = 0;
            }
        }
        int[] answer = Arrays.stream(arr).filter(i -> i != 0).toArray();
        return answer;
    }
}