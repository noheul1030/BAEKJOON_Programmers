import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(String s : str.split("")){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}