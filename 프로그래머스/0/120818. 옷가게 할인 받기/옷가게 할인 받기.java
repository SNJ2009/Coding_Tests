class Solution {
    public int solution(int price) {
        return (price >= 500000) ? (int)(price * (1 - 0.2)) :
                (price >= 300000) ? (int)(price * (1 - 0.1)) :
                (price >= 100000) ? (int)(price * (1 - 0.05)) :
                price;
    }
}