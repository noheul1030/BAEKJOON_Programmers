class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        
        if(Integer.parseInt(ab) < 2 * a * b){
            answer = 2 * a * b;
        }else{
            answer = Integer.parseInt(ab);
        }
        return answer;
    }
}