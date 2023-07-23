class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(char str : myString.toCharArray()){
            if(Character.isLowerCase(str) == false){
                answer += Character.toLowerCase(str);
            }else{
                answer += str;
            }
        }
        return answer;
    }
}