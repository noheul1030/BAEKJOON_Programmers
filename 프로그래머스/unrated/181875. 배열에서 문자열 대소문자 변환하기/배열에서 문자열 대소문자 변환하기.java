class Solution {
    public String[] solution(String[] strArr) {
        for(int i = 1; i <= strArr.length; i++){
            if(i % 2 == 1){
                strArr[i-1] = strArr[i-1].toLowerCase();
            }else{
                strArr[i-1] = strArr[i-1].toUpperCase();
            }
        }
        String[] answer = strArr;
        return answer;
    }
}