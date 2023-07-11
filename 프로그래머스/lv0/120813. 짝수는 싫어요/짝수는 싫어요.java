class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n/2 + n%2];
        for(int i = 0, j = 0; i <= n;i++){
            if(i%2 == 1){
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}