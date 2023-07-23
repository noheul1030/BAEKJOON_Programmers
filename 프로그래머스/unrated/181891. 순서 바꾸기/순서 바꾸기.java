import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] arr1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] arr2 = Arrays.copyOfRange(num_list, 0, n);

        int[] answer = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, answer, arr1.length, arr2.length);

        return answer;
    }
}