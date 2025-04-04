class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
            System.out.println(answer);
        }
        else if(num1 != num2){
            answer = -1;
        }
        return answer;
    }
}