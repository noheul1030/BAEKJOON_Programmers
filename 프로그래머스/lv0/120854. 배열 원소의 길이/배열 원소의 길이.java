class Solution {
    public int[] solution(String[] strlist) {
        int cnt = 0;
        int[] answer = new int[strlist.length];
        
        for(String str : strlist){
            answer[cnt] = str.length();
            cnt++;
        }
        return answer;
    }
}