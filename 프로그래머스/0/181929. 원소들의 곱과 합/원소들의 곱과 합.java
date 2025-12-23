class Solution {
    public int solution(int[] num_list) {
        int add = 0;
        int gop = 1;
        
        for(int number : num_list){
            add += number;
            gop *= number;
        }
        if(add * add > gop){
            return 1;
        } return 0;
    }
}