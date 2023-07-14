class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        
        for(int i = max; i > 0; i--){
            if(max < i + min){
                answer++;
            }
            if(max == i + min){
                break;
            }
        }
        
        for(int i = (max + min)-1; i > max; i--){
            answer++;
        }
        return answer;
    }
}