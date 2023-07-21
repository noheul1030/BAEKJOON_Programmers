class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        if(answer[answer.length-3] < answer[answer.length-2]) answer[answer.length-1] = answer[answer.length-2]- answer[answer.length-3];
        else answer[answer.length-1] = answer[answer.length-2] *2;
        return answer;
    }
}