class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String t = ineq + eq;
        
        switch(t){
            case ">=": return n >= m ? 1 : 0;
            case "<=": return n <= m ? 1 : 0;
            case ">!": return n > m ? 1 : 0;
            case "<!": return n < m ? 1 : 0;
            default: return 0;
        }
    }
}