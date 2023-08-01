import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" ");
        int x = 0;
        int num = 0;
        for(String s : str){
            if(s.contains("x")){
                if(s.startsWith("x")) x += 1;
                else x += Integer.parseInt(s.substring(0,s.length()-1));
            }else{
                if(!s.contains("+")){
                    num += Integer.parseInt(s);
                }
            }
        }
        
        String answer = "";
        if(x != 0 && num != 0){
            if(x == 1) answer = "x + " + num;
            if(x > 1) answer = x + "x + " + num;
        }
        else if(x == 0 && num != 0){
            answer = ""+ num;
        }
        else if(x != 0 && num == 0){
            if(x == 1) answer = "x";
            if(x > 1) answer = x + "x";
        }
        return answer;
    }
}