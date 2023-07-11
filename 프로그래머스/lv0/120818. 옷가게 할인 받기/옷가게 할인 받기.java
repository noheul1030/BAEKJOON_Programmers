class Solution {
    public int solution(int price) {
        return (price >= 100000 && price < 300000) ? (int)(price * 0.95) : (price >= 300000 && price < 500000) ? (int)(price * 0.9) : (price >= 500000) ? (int)(price * 0.8) : price;

    }
}