class Solution {
    public int solution(int n) {
        String toString = Integer.toString(n);
        int answer = 0;
        
        for(int i = 1; i <= toString.length(); i++){
            String str = toString.substring(i - 1, i);
            answer += Integer.parseInt(str);
        }
        return answer;
    }
}