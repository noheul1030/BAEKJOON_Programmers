import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] copy = Arrays.copyOf(num_list, num_list.length * 2);

        System.arraycopy(num_list, 0, copy, num_list.length, num_list.length);
        return Arrays.copyOfRange(copy, n, n + num_list.length);
    }
}