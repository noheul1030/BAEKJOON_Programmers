class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int max = Math.max(denom1,denom2);
        if(max == denom1){
            if(denom1 % denom2 == 0){
                answer[0] = numer1 + (numer2 * (denom1 / denom2));
                answer[1] = max;
            }else{
                answer[0] = (numer1 * denom2) + (numer2 * denom1);
                answer[1] = denom1 * denom2;
            }
        }
        else if(max == denom2){
            if(denom2 % denom1 == 0){
                answer[0] = numer2 + (numer1 * (denom2 / denom1));
                answer[1] = max;
            }else{
                answer[0] = (numer1 * denom2) + (numer2 * denom1);
                answer[1] = denom1 * denom2;
            }
        }
        
        int gcdNum = gcd(answer[0],answer[1]);
        answer[0] = answer[0] / gcdNum;
        answer[1] = answer[1] / gcdNum;
        
        return answer;
    }
        
        public int gcd(int denom1, int denom2){
            if(denom2 == 0) return denom1;
            return gcd(denom2, denom1 % denom2);
        } 
}