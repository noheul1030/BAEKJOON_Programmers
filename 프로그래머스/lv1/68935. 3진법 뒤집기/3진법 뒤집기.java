class Solution {
    public int solution(int n) {
        String th = new StringBuffer(Integer.toString(n,3)).reverse().toString();
        int answer = Integer.parseInt(th,3);
        return answer;
    }
}