import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        
        String str = "";
        
        for(String s : myStr.split("")){
            if(!(s.equals("a") || s.equals("b") || s.equals("c"))){
                str+=s;
            }else{
                if(!str.isEmpty()) list.add(str);
                str = "";
            }            
        }
        if(!str.isEmpty()) list.add(str);
        
        if(list.size()==0) list.add("EMPTY");
        String[] answer = list.stream().toArray(String[]::new);
        return answer;
    }
}