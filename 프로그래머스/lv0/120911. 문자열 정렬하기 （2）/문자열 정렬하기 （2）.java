import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        List<String> list = new ArrayList<String>();
        for(char str : my_string.toCharArray()){
            if(Character.isUpperCase(str)){
                list.add(String.valueOf(Character.toLowerCase(str)));
            }else{
                list.add(String.valueOf(str));
            }
        }
        Collections.sort(list);
        for(String str : list){
            answer = answer + str;
        }
        return answer;
    }
}