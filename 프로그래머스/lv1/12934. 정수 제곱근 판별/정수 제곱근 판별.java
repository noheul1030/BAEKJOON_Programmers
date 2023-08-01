class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (int)sqrt ? (long)Math.pow((long)sqrt+1,2) : -1;
    }
}