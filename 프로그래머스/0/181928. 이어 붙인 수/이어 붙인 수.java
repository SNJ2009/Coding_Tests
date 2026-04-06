class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";

        int listLeng = num_list.length;
        for(int num : num_list){
            if(num % 2 == 0){
                odd += String.valueOf(num);
            } else even += String.valueOf(num);
        }
        // System.out.println(Integer.parseInt(odd));
        return Integer.parseInt(odd) + Integer.parseInt(even);
        // return 0;
    }
}