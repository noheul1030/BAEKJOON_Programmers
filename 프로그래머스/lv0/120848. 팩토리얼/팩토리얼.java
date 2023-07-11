class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n==0 || n <i){
                break;
            }
            answer = i;
            n = n / i;
            
        }
        return answer;
    }
}