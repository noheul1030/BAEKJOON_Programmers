class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        int count = 0;
        for(String arr : picture){
            String pic = "";
            
            for(String str : arr.split("")){
                for(int i = 0; i < k; i++){
                    pic += str;
                }
            }
            for(int j = 0; j < k; j++){
                answer[count] = pic;
                count++;
            }
        }
        return answer;
    }
}