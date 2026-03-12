class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for(int list : arr){
            sum += list;
        }
        return sum/arr.length;
    }
}