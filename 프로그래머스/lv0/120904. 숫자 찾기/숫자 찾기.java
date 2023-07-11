class Solution {
    public int solution(int num, int k) {
        String n = Integer.toString(num);
        String k2 = Integer.toString(k);
        
        return n.contains(k2) == true ? n.indexOf(k2)+1 : -1;
    }
}