class Solution {
    public int solution(String my_string, String target) {
        int answer = my_string.contains(target) == true ? 1 : 0;
        return answer;
    }
}