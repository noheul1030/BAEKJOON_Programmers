class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int check = 0;
        for(int n = i; n <= j; n++){
            for(String str : Integer.toString(n).split("")){
                if(Integer.parseInt(str) == k) answer++;
            }
        }
        return answer;
    }
}