class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(String str : num_str.split("")){
            answer += Integer.parseInt(str); 
        }
        return answer;
    }
}