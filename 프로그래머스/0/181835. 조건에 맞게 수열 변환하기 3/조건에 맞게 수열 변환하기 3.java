class Solution {
    public int[] solution(int[] arr, int k) {
        int arrl = arr.length;
        
        if((k & 1) == 1){
            for(int i = 0; i < arrl; i++){
                arr[i] *= k;
            }
        } else {
            for(int i = 0; i < arrl; i++){
                arr[i] += k;
            }
        }
        return arr;
    }
}