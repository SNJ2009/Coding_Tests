import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> list = new ArrayList<>();
        
        if(n % 2 == 0){ n--; }
        for(int i = n; i > 0; i -= 2){ list.add(i); }
        list.sort(null);
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}