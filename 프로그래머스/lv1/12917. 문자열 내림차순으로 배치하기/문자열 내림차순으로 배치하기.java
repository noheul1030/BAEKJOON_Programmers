import java.util.*;
class Solution {
    public String solution(String s) {
        char[] str = s.toCharArray();
        Arrays.sort(str);
        
        return new StringBuffer(new String(str)).reverse().toString();
    }
}