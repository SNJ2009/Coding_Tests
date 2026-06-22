import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        
        int mean = 0;
        if(array.length % 2 == 1){
            mean = array[array.length / 2]; 
        } else 
            mean = (array[array.length / 2] + array[array.length / 2]) / 2;
        
        return mean;
    }
}