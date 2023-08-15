import java.util.*;
class Solution{
    public int solution(String s){
        int answer = -1;
        
//         for(int i = 0; i < s.length()-1; i++){
//             if(s.charAt(i) == s.charAt(i+1)){
//                 s = s.replaceAll(s.substring(i,i+2),"");
//                 i = -1;
//             }
//         }
        
//         if(s.isEmpty() == true) answer = 1;
//         else answer = 0;
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(ch);
            }else{
                if(stack.peek() == ch) stack.pop();
                else stack.push(ch);
            }
        }
        if(stack.isEmpty()) answer = 1;
        else answer = 0;

        return answer;
    }
}