import java.util.*;
class Solution {
    boolean solution(String s) {
        
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(ch == '(') stack.push(ch);
            else{
                if(stack.isEmpty()) return false;
                else if(stack.peek() == '(') stack.pop();
                else stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}