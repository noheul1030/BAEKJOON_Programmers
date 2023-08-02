class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            int count = re(i,i,0);
            if(count % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    public int re(int num, int num2, int cnt){
        if(num2 == 0) return cnt;
        else {
            if(num % num2 == 0){
                return re(num,num2-1,cnt+1);
            }else{
                return re(num,num2-1,cnt);
            }
        }
    }
}