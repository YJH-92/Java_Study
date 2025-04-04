public class Solution5_문자열계산하기 {
    public int solution(String myString) {
        String[] myList = myString.split(" ");
        
        int answer = Integer.parseInt(myList[0]);
        
        for (int i = 1; i < myList.length - 1; i += 2) {
        
        String operator = myList[i];
        
        int number = Integer.parseInt(myList[i + 1]);
        if (operator.equals("+")) {
            answer += number;
        } else {
            answer -= number;
        }
    }
    return answer; 
}
public static void main(String[] args) {
    Solution5_문자열계산하기 sol = new Solution5_문자열계산하기();
    System.out.println(sol.solution("3 + 4")); // 7
    System.out.println(sol.solution("5 + 7 - 2 - 5 + 10")); // 15
    }
}
