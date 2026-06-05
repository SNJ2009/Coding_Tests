import java.lang.StringBuilder;
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String[] slice = my_string.toLowerCase().split("");
        Arrays.sort(slice);
        
        for(String one : slice){
            sb.append(one);
        }
        
        return sb.toString();
    }
}