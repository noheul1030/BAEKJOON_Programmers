class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(String str : my_string.split("[a-zA-Z]")){            
            if (!str.isEmpty()) {
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
}
