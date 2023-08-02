import java.util.*;
class Solution {
    public int solution(int[] common) {
        int n = common[1] - common[0];
        
        return common[2] - common[1] == n ? common[common.length-1] + n : common[common.length-1] * common[1] / common[0];
    }
}