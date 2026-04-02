class Solution {
    public int solution(int n) {
        int sqrt = (int)Math.sqrt(n);
        System.out.println(sqrt);
        boolean tf = sqrt * sqrt == n;
        
        return tf ? 1 : 2;
    }
}