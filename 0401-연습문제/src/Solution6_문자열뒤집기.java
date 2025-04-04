public class Solution6_문자열뒤집기 {
    public String solution(String myString) {
        // 문자열을 문자 배열로 변환하여 저장
        char[] answer = myString.toCharArray();
        // 문자열의 길이를 구함
        int n = answer.length;
        // 문자열의 절반 길이만큼 반복하면서 앞뒤 문자를 교환
        for (int i = 0; i < n / 2; i++) {
        int p = n - i - 1; // 뒤에서부터의 인덱스를 계산
        char temp = answer[i]; // 현재 문자를 임시 저장
        answer[i] = answer[p]; // 뒤쪽 문자를 앞쪽으로 이동
        answer[p] = temp; // 임시 저장한 문자를 뒤쪽으로 이동
    }
    // 문자 배열을 다시 문자열로 변환하여 반환
    return new String(answer);
    }
    // 테스트 예제 실행
    public static void main(String[] args) {
        Solution6_문자열뒤집기 sol = new Solution6_문자열뒤집기();
    System.out.println(sol.solution("jaron")); // "noraj"
    System.out.println(sol.solution("bread")); // "daerb"
    }
   }
   

