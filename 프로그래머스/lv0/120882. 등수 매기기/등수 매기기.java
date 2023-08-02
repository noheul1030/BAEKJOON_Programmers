class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] re = new int[score.length];
        
        for(int i = 0; i < score.length; i++){
            re[i] = score[i][0]+score[i][1];
        }
        
        for(int i = 0; i < re.length; i++){
            answer[i] = 1;
            for(int j = 0; j < re.length; j++){                
                if(re[i] < re[j]) answer[i]++;
            }
        }        
        return answer;
    }
}