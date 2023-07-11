import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] be = before.toCharArray();
        char[] af = after.toCharArray();
        Arrays.sort(be);
        Arrays.sort(af);
        if(new String(be).equals(new String(af))){
            return 1;
        }
        return answer;
    }
}