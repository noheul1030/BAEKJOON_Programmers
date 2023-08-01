import java.util.*;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        
        List<Integer> list = new ArrayList<>();
        for(String s : str.split("")){
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        Collections.reverse(list);
        
        str = "";
        for(int i : list){
            str += Integer.toString(i);
        }
        long answer = Long.parseLong(str);
        return answer;
    }
}