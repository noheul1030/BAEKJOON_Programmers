class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        int count = 0;
        for(String c : code.split("")){
            if(c.equals("1")){
                mode = (mode == 0)? 1 : 0;
            }else{
                if(mode == 0 && count % 2 == 0){
                    answer += c;
                }
                if(mode == 1 && count % 2 == 1){
                    answer += c;
                }
            }
            count++;
        }
        return answer.isEmpty() == true ? "EMPTY" : answer;
    }
}