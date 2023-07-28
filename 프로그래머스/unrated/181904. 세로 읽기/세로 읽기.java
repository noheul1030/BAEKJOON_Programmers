class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] arr = my_string.split("");
        int cnt = 1;
        for(int i = 0; i < arr.length; i++){
            if(cnt == c) answer+=arr[i];
            cnt++;
            if(cnt > m) cnt = 1;
        }
        return answer;
    }
}