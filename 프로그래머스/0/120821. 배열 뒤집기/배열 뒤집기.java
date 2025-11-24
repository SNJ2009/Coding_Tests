class Solution {
    public int[] solution(int[] num_list) {
        int save = 0;
        for(int i = 0; i < num_list.length; i++){
            for(int j = i; j < num_list.length; j++){
                save = num_list[i];
                num_list[i] = num_list[j];
                num_list[j] = save;
            }
        }
        return num_list;
    }
}