class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        int count = 0;
        for(String str : picture){
            String ss = "";
            for(String s : str.split("")){
                for(int i = 0; i < k; i++){
                    ss += s;
                }
            }
            for(int j = 0; j < k; j++){
                answer[count] = ss;
                count++;
            }
        }
        return answer;
    }
}