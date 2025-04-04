public class Solution1_369게임 {
    public int solution_test_1(int order) {
        int answer = 0;    // <============================1) 박수를 칠 횟수를 저장할 변수
        
        String orderStr = String.valueOf(order); // <======2) 숫자를 문자열로 변환하여 각 자리수를 분석

        for (char c : orderStr.toCharArray()) { // <=======3) 문자열을 순화하면서 각 자리의 숫자를 확인

            if (c=='3' || c == '6' || c=='9') {  // <======4) '3', '6', '9' 중 하나라면 카운트 증가
                answer++;
            }
        }

        return answer;  // <===============================5) 최종적으로 박수를 칠 획수 반환
    }

    public static void main(String[] args) {
        Solution1_369게임 sol = new Solution1_369게임();
        System.out.println(sol.solution_test_1(3));      // <=====* 1 (3이 포함됨)
        System.out.println(sol.solution_test_1(29423));  // <=====* 2 (9와 3이 포함됨)
    }
}
//==============수 정 전=========================
//public static void main(String[] args) {
//    Solution_test_1 sol = new Solution();
//    System.out.println(sol.solution(3));
//    System.out.println(sol.solution(29423));
//===============================================