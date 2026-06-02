class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        for(int i = 1; i < array.length; i++){
            int num1 = Math.abs(n - answer);
            int num2 = Math.abs(n - array[i]);
            
            if(num1 > num2){
                answer = array[i];
            } else if (num1 == num2 && answer > array[i]){
                answer = array[i];
            }
        }
        return answer;
    }
}