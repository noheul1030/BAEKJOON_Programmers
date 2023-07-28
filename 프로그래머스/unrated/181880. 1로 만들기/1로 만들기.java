class Solution {
    public int solution(int[] numlist) {
        int answer = 0;
        for(int i : numlist){
            int cnt = 0;
            int ii = i;
            while(ii != 1){
                ii = ii % 2 == 0 ? ii / 2 : (ii - 1) / 2;
                cnt++;
            }
            answer+= cnt;
        }
        return answer;
    }
}