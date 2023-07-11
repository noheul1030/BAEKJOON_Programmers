class Solution {
    public int solution(int order) {
        int answer = 0;
        
        while(order > 0){
            if(order % 10 == 3) answer++;
            if(order % 10 == 6) answer++;
            if(order % 10 == 9) answer++;
            order = order / 10; 
            
        }
        return answer;
    }
}