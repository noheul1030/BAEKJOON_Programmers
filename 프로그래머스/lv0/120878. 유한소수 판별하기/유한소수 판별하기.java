class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        while(true){
            int gcd = gcd(a,b);
            if(gcd == 1) break;
            else{
                a = a / gcd;
                b = b / gcd;
            }
        }
        
        while(b != 1){
            if(b % 2 == 0){
                b = b / 2;
                continue;
            }else{
                if(b % 5 == 0){
                    b = b / 5;
                    continue;
                }else{
                    answer = 2;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}