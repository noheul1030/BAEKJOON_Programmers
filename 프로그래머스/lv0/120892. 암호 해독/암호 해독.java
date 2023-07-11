class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        for(String str : cipher.split("")){
            if(i == code) {
                answer = answer + str;
                i = 1;
            }
            else i++; 
        }
        return answer;
    }
}