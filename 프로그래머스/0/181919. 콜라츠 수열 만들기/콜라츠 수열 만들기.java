import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> arr = new ArrayList<>();
        
        while(true){
            arr.add(n);
            if(n == 1){ break; }
            
            if((n & 1) == 0){
                n /= 2;
            } else n = 3 * n + 1;
        }
            
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}