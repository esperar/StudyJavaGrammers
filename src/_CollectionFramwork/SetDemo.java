package _CollectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Iterator;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        // A 안의 값 중에 B 의 값이 모두 포함 되어 있는가 ?
        System.out.println(A.containsAll(B)); // false
        //  A 안의 값 중에 C 의 값이 모두 포함 되어 있는가 ?
        System.out.println(A.containsAll(C)); // true

        // A.addAll(B); : A B 둘의 값을 합침 중복된 값은 하나로 설정됨
        // A.retainAll(B); : 둘의 교집합 서로 같이 가지고 있는 값으로 설정됨
        // A.removeAll(B); : 둘의 차집합으로 B 와 중복되지 않는 값으로만 설정됨

        Iterator hi = A.iterator(); // A 의 값을 갖고있는 가상의 이터레이터가 추가
        while(hi.hasNext()){ // hasNext 그 다음 값을 가지고 있으면 true 를 반환.
            System.out.println(hi.next());
            // hi 가 가지고있는 값들 중 하나를 리턴하고 hi 안의 있는 값은 사라진다. (원본 데이터의 값은 사라지지 않음)
        }
    }

}