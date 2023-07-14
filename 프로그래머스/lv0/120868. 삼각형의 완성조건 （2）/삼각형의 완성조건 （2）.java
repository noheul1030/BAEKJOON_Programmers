class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0] > sides[1] ? sides[0] : sides[1];
        int min = sides[0] < sides[1] ? sides[0] : sides[1];
        
        for(int i = 1; i < min + max; i++){
            if(i > max){
                answer++;
            }else if(min + i > max){
                answer++;
            }
        }
        return answer;
    }
}