class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int turn = a;
        for(int i = 0; i < included.length; i++){
            if(included[i] == true){
                answer += turn;
                turn += d;
            }else{
                turn +=d;
            }
        }
        return answer;
    }
}