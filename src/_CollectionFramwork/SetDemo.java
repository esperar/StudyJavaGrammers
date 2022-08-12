package _CollectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        // HashSet  ArrayList 의 차이점은 중복 값을 저장하느냐 안하느냐의 차이가 있다.
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        a1.add(2);
        a1.add(2);
        a1.add(3);
        /*
         메소드 iterator 는 인터페이스 컬렉션에 정의되어 있다. 따라서 컬렉션을 구현하고 있는 모든 컬렉션즈 프레임워크는 이 메소드를
         구현하고 있음을 보증한다. 메소드  iterator 의 호출 결과는 인터페이스 이터레이터를 구현한 객체를 리턴한다.
         인터페이서 이터레이터는 아래의 3개 메소드를 구현하도록 강제하고 있다.
         - hasNext : 반복할 데이터가 더 있으면 참 없다면 거짓을 반환
         - next hasNext 가 참이라는 것은 next 가 리턴할 데이터가 존재한다는 의미이다.
         */
        Iterator ai = a1.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
            /*
            1
            2
            2
            2
            3
             */
        }

        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        // 중복된 데이터가 추가되지 않고 하나만 출력됨을 볼 수 있음
        Iterator hi = hs.iterator();
        while (hi.hasNext()){
            System.out.println(hi.next());
            /*
            1
            2
            3
             */
        }
    }
}
