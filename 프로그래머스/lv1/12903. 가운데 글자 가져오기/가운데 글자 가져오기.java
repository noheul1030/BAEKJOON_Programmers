class Solution {
    public String solution(String s) {
        String answer = "";
        int middle = s.length() / 2;
        if(s.length() % 2 == 1){
            answer = s.substring(middle,middle + 1);
        }else{
            middle -= 1;
            answer = s.substring(middle,middle + 2);
        }
        return answer;
    }
}