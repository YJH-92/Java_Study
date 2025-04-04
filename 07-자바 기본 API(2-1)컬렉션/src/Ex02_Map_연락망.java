import java.util.Map;
import java.util.HashMap;

public class Ex02_Map_연락망 {
    public static void main(String[] args) {
        Map<String, Member> map = new HashMap<String, Member>();

        //객체 생성 후 map에 추가하기
        Member mem1 = new Member("010-1234-2345", "member1@naver.com");
        map.put("철수", mem1);

        //참조변수 없이 map에 직접추가
        map.put("수현", new Member("010-1234-2345", "member2@naver.com"));
        map.put("석훈", new Member("010-3456-4567", "member3@naver.com"));
        map.put("민영", new Member("010-4567-5678", "member4@naver.com"));
        map.put("호영", new Member("010-5678-6789", "member5@naver.com"));

        //저장한 객체중 하나를 추출하여 내용 확인
        Member output = map.get("호영");
        System.out.println(output.toString());
    }
}
