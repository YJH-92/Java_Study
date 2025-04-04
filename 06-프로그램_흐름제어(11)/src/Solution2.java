class Solution2 {
    public int Solution(int angle) {
        if(0 < angle && angle < 90) {
            System.out.print(1);
            return 1;
        }
        else if(90 < angle && angle < 180) {
            System.out.print(3);
            return 3;
        }
        else if(angle == 180){
            System.out.print(4);
            return 4;
        }
        int answer = 0;
        
        return answer;
    }
}