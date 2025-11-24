class Solution {
    public int solution(int n, int t) {
        for(int i = t; i --> 0;){
            n *= 2;
        }
        return n;
    }
}