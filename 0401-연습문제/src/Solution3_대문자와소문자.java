public class Solution3_대문자와소문자  {
    public String solution(String myString) {
        String result = ""; //<=============================1) 변환된 문자열을 저장할 변수
        
        for (char c : myString.toCharArray()) {  //<========2) 문자열의 각 문자를 순회하며 변환
            
            if (Character.isUpperCase(c)) {
                result += Character.toLowerCase(c); //<======3) 현재 문자가 대문자인 경우 소문자로 변환하여 추가
                } else {
                    result += Character.toUpperCase(c); //<==4) 현재 문자가 소문자인 경우 대문자로 변환하여 추가
                    }
                }
                return result; // <==========================5) 변환된 문자열 반환
                }

                public static void main(String[] args) {
                    Solution3_대문자와소문자 sol = new Solution3_대문자와소문자();
                    System.out.println(sol.solution("cccCCC"));     // CCCccc
                    System.out.println(sol.solution("abCdEfghIJ")); // ABcDeFGHij

            }
        }