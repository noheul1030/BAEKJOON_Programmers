class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start+1 - end];
        for(int i = start,j = 0; i >= end; i--){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}