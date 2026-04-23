import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[][] patterns = { // 찍기 패턴
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] counts = new int[3];
        for(int i = 0; i < answers.length; i++){ // 정답
            for(int j = 0; j < 3; j++){ // 찍기
                if(answers[i] == patterns[j][i % patterns[j].length]){
                    counts[j]++;
                }
            }
        }
        
        int max = 0;
        for(int count : counts){
            if(count > max) max = count;
        }
        
        List<Integer> high = new ArrayList<>();
        for(int i = 0; i < counts.length; i++){
            if(counts[i] == max){
                high.add(i + 1);
            }
        }
        
        int[] result = new int[high.size()];
        for(int i = 0; i < high.size(); i++){
            result[i] = high.get(i);
        }
        return result;
    }
}