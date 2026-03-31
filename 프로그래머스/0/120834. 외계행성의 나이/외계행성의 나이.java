class Solution {
    public String solution(int age) {
        String tostr = Integer.toString(age);
        String answer = "";
        for(int i = 0 ;  i < tostr.length(); i++){
            answer += (char)(tostr.charAt(i) + 49);
        }
        return answer;
    }
}