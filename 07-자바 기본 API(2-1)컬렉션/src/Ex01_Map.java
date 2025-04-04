import java.util.Map;
import java.util.HashMap;

public class Ex01_Map {
    public static void main(String[] args) {
        /**Map 객체의 생성 */
        //key(데이터이름)로 사용할 값에 대한 데이터 타입과
        //value(저장할 값)로 사용할 값에 대한 데이터 타입을
        //객체 선언시 <key, value> 형식으로 명시
        //--> "<key, value>" 형식으로 사용할 데이터 타입을 선언시에 정하는것을 제너릭이라고함
        // 기본 자료형을 사용할 경우 연관된 WrapperClass로 선언한다.
        Map<String, Integer> map = new HashMap<String, Integer>();

        //map 객체에 데이터 추가
        map.put("나이", 21);
        map.put("키", 175);
        map.put("몸무게", 80);

        //저장된 데이터의 수
        System.out.printf("저장된 데이터의 수: %d\n", map.size());

        //저장된 데이터 꺼내서 사용하기
        System.out.printf("AGE: %d\n",map.get("나이"));
        System.out.printf("HEIGHT: %d\n",map.get("키"));
        System.out.printf("WEIGHT: d%\n",map.get("몸무게"));
    }
}
