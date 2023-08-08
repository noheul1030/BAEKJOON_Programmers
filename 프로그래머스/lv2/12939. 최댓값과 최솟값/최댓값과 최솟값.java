import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] numstr = new int[str.length];
        
        for(int i = 0; i < str.length; i++){
            numstr[i] = Integer.parseInt(str[i]);
        }
        
        // int min = Arrays.stream(numstr).min().getAsInt();
        // int max = Arrays.stream(numstr).max().getAsInt();        
        
        // return Integer.toString(min) + " " + Integer.toString(max);
        Arrays.sort(numstr);
        return numstr[0] + " " + numstr[numstr.length-1];
    }
}