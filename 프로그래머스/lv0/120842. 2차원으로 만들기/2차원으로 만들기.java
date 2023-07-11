class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        for(int i = 0, j = 0, k = 0; i < num_list.length; i++){
            answer[j][k] = num_list[i];
            k++;
            if(k % n == 0) {
                j++; k = 0; 
            }
        }
        return answer;
    }
}