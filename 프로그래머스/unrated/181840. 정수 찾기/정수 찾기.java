import java.util.*;
import java.util.stream.*;
class Solution {
    public int solution(int[] num_list, int n) {
        int answer = Arrays.stream(num_list).filter(i -> i == n).count() >= 1 ? 1 : 0;
        return answer;
    }
}