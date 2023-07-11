import java.util.*;
import java.io.*;
class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(String ss1 : s1){
            for(String ss2 : s2){
                answer += (ss1.equals(ss2)) ? 1 : 0;
            }
        }
        return answer;
    }
}