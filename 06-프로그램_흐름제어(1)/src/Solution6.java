class Solution {
    public int solution(int balls, int share) {
        int n = balls;
        int m = share;

        // n개 중에 m개를 선택하는 경우의 수는
        // n개 중에서 n-m개를 선택하지 않는 경우의 수와 같다.
        // => m과 n-m 중에서 작은 값을 사용해 계산하는 것이 효율이 좋다.
        if (m>n-m) {
            m = n-m;
        }
                                                 
        //결과값을 저장할 변수
        long answer = 1;

        //n-m+1부터 n까지 곱함
        for(int i = 0; i<m; i++) {
            answer *=(n-i);
            answer /=(i+1);
        }

        return (int) answer;
    }
}