class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        for(int i = start, j = 0; i <= end; i++){
            answer[j] = i;
            j++;
        }
        return answer;
    }
}