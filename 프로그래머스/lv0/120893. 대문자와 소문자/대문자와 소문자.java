class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char ch : my_string.toCharArray()){
            if(Character.isUpperCase(ch)) answer = answer + Character.toLowerCase(ch);
            else answer = answer + Character.toUpperCase(ch);
        }
        return answer;
    }
}