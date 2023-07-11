class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n;i++){
            if(i * (n/i) == n){
                answer++;
            }            
        } 
        return answer;
    }
}