class Solution {
    public boolean solution(int x) {
        String str = String.valueOf(x);
        int xx = 0;
        
        for(String s : str.split("")){
            xx += Integer.parseInt(s);
        }
        
        return x % xx == 0 ? true : false;
    }
}