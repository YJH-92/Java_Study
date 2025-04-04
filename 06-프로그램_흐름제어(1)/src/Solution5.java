class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken>= 10) { //서비스를 받을 수 없을 때 까지 반복
            //10마리당 받을 수 있는 서비스 수
            int service  = chicken / 10;

            // 서비스 받고 남은 쿠폰수
            int reminder = chicken % 10;

            // 문제가 원하는 답은 서비스를 총 몇마리 받았는가?
            answer += service;
            
            // 서비스 주문 후 변경된 쿠폰 수를 계산
            chicken = service+ reminder;
        }

        return (int) answer;
    }
}