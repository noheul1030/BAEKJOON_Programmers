class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        if(A.equals(B)) return 0;
        int count = 1;
        
        while(count <= A.length()){
            A = A.substring(A.length()-1) + A.substring(0,A.length()-1);
            if(A.equals(B)) return count;
            count++;
        }
        return answer;
    }
}