class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a){
            int re = 0;
            answer += n / a * b;
            re = n % a;
            n = n / a * b + re;   
        }
        return answer;
    }
}