class Solution {
    public int solution(String myString, String pat) {
        myString = myString.replaceAll("A","b");
        myString = myString.replaceAll("B","a");
        myString = myString.toUpperCase();
        if(myString.contains(pat)) return 1;
        int answer = 0;
        
        return answer;
    }
}