class Solution {
    int gcd(int n, int m){
        if(m == 0){
            return n;
        }else{
            return gcd(m,n % m);
        }
    }
    public int solution(int n) {
        int answer = 0;
        int m = 6;
        
        return  (n * m / gcd(n,m)) / m;
    }
}