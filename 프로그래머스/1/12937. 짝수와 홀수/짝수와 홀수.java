class Solution {
    public String solution(int num) {
        return ((num & 1) != 1) ? "Even" : "Odd";
    }
}