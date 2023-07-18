class Solution {
    public int solution(int n) {
        int answer = n;
        
        for(int i = 1; i <= answer; i++){ 
            if(i % 3 == 0 || Integer.toString(i).contains("3")){
                answer++;
            }
        }        
        return answer;
    }
}