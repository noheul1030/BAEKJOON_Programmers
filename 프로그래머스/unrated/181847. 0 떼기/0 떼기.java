class Solution {
    public String solution(String n_str) {
        String answer = "";
        int start = 0;
        for(String str : n_str.split("")){
            if(Integer.parseInt(str) != 0) start = 1;
            if(start == 1){
                answer += str;
            }
            
        }
        return answer;
    }
}