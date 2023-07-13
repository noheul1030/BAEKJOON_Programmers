class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int arr = 0;
        for(int num1 : emergency){
            int count = 1;
            for(int num2 : emergency){
                if(num1 < num2) count++;
            }
            answer[arr] = count;
            arr++;
        }
        return answer;
    }
}