class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        System.out.println("제곱근 : " + sqrt);
        return sqrt == (int)sqrt ? (long)Math.pow((long)sqrt+1,2) : -1;
    }
}