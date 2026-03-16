import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        for(int idx = 0; idx < seoul.length; idx++){
            if(seoul[idx].equals("Kim")){
                return "김서방은 " +idx+ "에 있다";
            }
        }
        return "";
    }
}