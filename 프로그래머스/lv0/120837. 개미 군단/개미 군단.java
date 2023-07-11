class Solution {
    public int solution(int hp) {
        int answer = 0;
        int[] a = {5,3,1};
        
        for(int i : a){
            if(hp != 0){
                answer += hp/i;
                hp = hp%i;
            }
        }
        return answer;
    }
}