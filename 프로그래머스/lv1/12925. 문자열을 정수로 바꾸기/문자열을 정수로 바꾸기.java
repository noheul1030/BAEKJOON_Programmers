class Solution {
    public int solution(String s) {
        int answer = 0;
        return s.substring(0,1) == "-" ? 
            answer - Integer.parseInt(s.substring(1)) :
            answer + Integer.parseInt(s.substring(0));
    }
}