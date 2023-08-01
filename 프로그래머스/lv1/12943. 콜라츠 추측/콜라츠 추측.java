class Solution {
    public long solution(long num) {
        if(num == 1) return 0;
        else return Collatz(num, 0);
    }
    
    public long Collatz(long num, int cnt){
        if(num == 1 && cnt != 500) return cnt;
        if(num != 1 && cnt == 500) return -1;
        
        if(num % 2 == 0) num = num / 2;
        else num = num * 3 + 1;
        
        return Collatz(num,cnt+1);
    }
}
