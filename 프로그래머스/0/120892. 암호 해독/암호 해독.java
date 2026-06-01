class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int temp = code - 1;
        while(cipher.length() > temp){
            answer += cipher.charAt(temp) + "";
            temp += code;
        }
        return answer;
    }
}