import java.util.*;
class Solution {
    public String solution(String myString) {
        List<String> list = List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
        int index = list.indexOf("l");
        String answer = "";
        for(String str : myString.split("")){
            if(list.indexOf(str) < index) answer += "l";
            else answer += str;
        }
        return answer;
    }
}