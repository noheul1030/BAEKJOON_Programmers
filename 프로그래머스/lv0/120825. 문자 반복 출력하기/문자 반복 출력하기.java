class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(String str : my_string.split(""))
            answer += (new String(new char[n]).replace("\0", str));
        return answer;
    }
}