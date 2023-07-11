import java.util.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = new ArrayList<String>();
        for(String str : my_string.split("")){
            if(!(list.contains(str))) list.add(str);
        }        
        String answer = "";
        for(String str : list){
            answer = answer + str;
        }
        return answer;
    }
}