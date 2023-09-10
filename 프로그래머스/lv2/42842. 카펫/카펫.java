class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int sum = brown + yellow;

        for(int i = 1; i <= sum; i++){
            int num1 = i;
            int num2 = sum / num1;
            
            if(num1 > num2) continue;
            
            if(((num1-2) * (num2 -2)) == yellow) {
                answer = new int[]{num2,num1};
                break;
            }
        }
                
        return answer;
    }
}