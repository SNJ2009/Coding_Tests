class Solution {
    public int solution(String my_string) {
        char[] toChar = my_string.toCharArray(); // 48 ~ 57
        int sum = 0;
        
        for(char ch : toChar){
            if(ch >= 48 && ch <= 58){
                sum += ch - 48;
            }
        }
        
        return sum;
    }
}