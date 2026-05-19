class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int damages = 5;
        while(hp > 0){
            if(hp - damages >= 0){
                hp -= damages;
                answer++;
            } else damages -= 2;
        }
        return answer;
    }
}