import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", ""); // 문자 제거
        // System.out.println(my_string);
        
        int toInt = Integer.parseInt(my_string);
        int leng = my_string.length();
        int[] result = new int[leng];
        
        for(int i = 0; i < leng; i++){
            result[i] = toInt % 10;
            toInt /= 10;
        }
        
        Arrays.sort(result);
        return result;
    }
}