class Solution {
    public int solution(String number) {
        int answer = 0;
        for(String str : number.split("")){
            answer += Integer.parseInt(str);
        }
        answer %= 9;
        return answer;
    }
}