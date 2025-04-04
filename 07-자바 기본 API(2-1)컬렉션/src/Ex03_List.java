import java.util.List;
import java.util.ArrayList;

public class Ex03_List {
    public static void main(String[] args) {
        /** 1) 객체 생성 */
        //객체 생성시 제너릭의 사용
        //클래스 이름 오른쪽에 <저료형>의 형식으로 표현한다.
        //이때 자료형에는 클래스타입만 가능하다.
        //기본 데이터형을 사용하고자 하는 경우에는 해당 데이터형의 WrapperClass를 사용해야 한다.
        List<Integer> numberList = new ArrayList<Integer>();
        
        /** 2) 데이터 추가하기 */
        numberList.add(10); //인덱스 0
        numberList.add(20); //인덱스 1
        numberList.add(30); //인덱스 2
        numberList.add(40); //인덱스 3
        numberList.add(50); //인덱스 4
        numberList.add(60); //인덱스 5
        numberList.add(70); //인덱스 6
        numberList.add(80); //인덱스 7
        numberList.add(90); //인덱스 8

        //** 3) 추가된 테이터 활용하기  */
        //추가된 데이터의 수량
        int count = numberList.size();
        System.out.println("데이터 크기: " + count);

        //인덱스 번호가 4인 데이터 추출
        int value = numberList.get(4);
        System.out.println("4번째 요소의 값: " + value);

        //인덱스 번호가 4인 데이터 삭제
        // --> 뒤의 데이터들이 빈자이를 매꾸기 위해 앞으로 이동
        numberList.remove(4);

        // 하나를 삭제 후, 전체 크기 다시 조회 --> 8개
        count = numberList.size();
        System.out.println("데이터 크기: " + count);

        //인덱스 번호가 4인 데이터 다시 얻기
        value = numberList.get(4);
        System.out.println("4번째 요소의 값: " + value);

        //인덱스 번호가 4인 위치에 데이터 삽입
        // --> 원래의 데이터들이 뒤로 한칸씩 밀려난다.
        numberList.add(1,123);
        value = numberList.get(4);
        System.out.println("4번째 요소의 값: " + value);

        //하나를 삭제 후, 전체 크기 다시 조회 --> 9개
        count = numberList.size();
        System.out.println("데이터 크기: " + count);

        //리스트 원소 탐색                                                               //  매          /
        for (int i = 0; i < numberList.size(); i++) {                                   //  우          /
            //i번째 원소 추출 --> 제너릭으로 선언한 클래스에 대한 객체가 된다.            //  중          /
            Integer number = numberList.get(i);                                        //  요          /
            System.out.printf("%d번째 데이터 >> %d\n", i, number);                     //  (평생 사용) /
        }                                                                             //             /

        //전체 삭제
        numberList.clear();
        count = numberList.size();
        System.out.println("데이터 크기: " + count);
    }
}
