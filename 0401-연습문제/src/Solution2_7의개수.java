import java.util.*;

class Solution2_7의개수 {
    public int solution_test_2(int[] array) {
        int count = 0;    // <===========================1)숫자 '7'의 개수를 저장할 변수

        for (int num : array) {   // <===================2)배열의 모든 요소를 확인
            String numStr = String.valueOf(num); // <====3)숫자를 문자열로 변환하여 '7'의 개수를 세기

            for (char c : numStr.toCharArray()) { // <===4)문자열 순회하면서 '7'이 몇번 등장하는지 확인
                if (c=='7'){    
                    count++;    // <=====================5)문자가 '7'이면 카운트 증가
                }
            }
        }
        return count; // <===============================6)최종적으로 7이 등장한 횟수 반환
    }
    public static void main(String[] args) {
        Solution2_7의개수 sol = new Solution2_7의개수();
        System.out.println(sol.solution_test_2(new int[]{7, 77, 17}));  // <== 4('7'이 4번 등장)
        System.out.println(sol.solution_test_2(new int[]{10, 29}));     // <== 0('7'이 없음)
    }
}















//===================정답 오픈 전===================
//class Solution_test_2 {
//    public int answer(int[] array) {
//        int answer = 0;
//
//        for(int num : array) {
//            String strNum = Integer.toString(num);
//            
//            for(int i=0; i < strNum.length(); i++) {
//                if(strNum.charAt(i)=='7') {
//                    answer++;
//                }
//            }
//        }
//        return answer;
//    }
//}