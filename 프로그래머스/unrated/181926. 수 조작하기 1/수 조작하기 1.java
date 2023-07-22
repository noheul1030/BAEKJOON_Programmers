class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        for(String str : control.split("")){
            if(str.equals("w")) n += 1;
            if(str.equals("s")) n -= 1;
            if(str.equals("d")) n += 10;
            if(str.equals("a")) n -= 10;
        }
        return n;
    }
}