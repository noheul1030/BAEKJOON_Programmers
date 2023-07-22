class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int[] i : queries){
            String result = "";
            for(int j = i[1]; j >= i[0]; j--){
                result += my_string.charAt(j);
            }
            my_string = my_string.substring(0,i[0]) + result + my_string.substring(i[1]+1,my_string.length());
        }
        answer = my_string;
        return answer;
    }
}