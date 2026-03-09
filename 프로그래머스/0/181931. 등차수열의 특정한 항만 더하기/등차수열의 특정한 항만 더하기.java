class Solution {
    public int solution(int a, int d, boolean[] included) {
        int result = 0;
        
        for(boolean tf : included){
            if(tf){
                result += a;
            }
            a += d;
        }
        
        return result;
    }
}