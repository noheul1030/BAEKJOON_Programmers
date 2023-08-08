class Solution {
    static int[] data = new int[100001]; // 최대값 100000
    public int solution(int n) {
        return pibo(n);
    }
    
    public int pibo(int n){
        if(n <= 1) return n;
        if(data[n] != 0) return data[n] % 1234567;
        return data[n] = (pibo(n - 1) + pibo(n - 2)) % 1234567;
    }
}