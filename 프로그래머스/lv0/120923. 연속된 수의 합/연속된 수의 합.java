class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int cnt = 0;
        if(num % 2 != 0){
            int start = (total / num)-(num / 2);
            for(int i = start; i < start + num; i++){
                answer[cnt] = i;
                cnt++;
            }
        }else{
            int start = (total / num)-(num / 2 - 1);
            for(int i = start; i < start + num; i++){
                answer[cnt] = i;
                cnt++;
            }
        }
        return answer;
    }
}