class Solution {
    public int solution(int n, String control) {
        int[] m = new int['w' + 1];
        m['w'] = 1;
        m['s'] = -1;
        m['d'] = 10;
        m['a'] = -10;
        
        int l = control.length();
        for(int i = 0; i < l; i++){
            n += m[control.charAt(i)];
        }
        return n;
    }
}