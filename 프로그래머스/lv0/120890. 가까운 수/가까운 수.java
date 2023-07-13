class Solution {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        for(int num : array){
            int result = num - n;
            if(Math.abs(result) < Math.abs(answer)){
                answer = result;
            }else if(Math.abs(result) == Math.abs(answer) && result < answer){
                answer = result;
            }
        }
        answer = n + answer;
        return answer;
    }
}