package _CollectionFramwork;

import java.util.ArrayList;

/*
    배열은 연관된 데이터를 관리하기 위한 수단이다. 그런데 배열에는 몇가지 불편한 점이 있다.
    그 중 하나가 한번 정해진 배열의 크기를 변경할 수 없다는 점이다. 이러한 불편함을 컬렉션즈 프레임워크를 사용하면 줄어든다.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 아래의 예시는 배열의 크기를 지정했기 때문에 그 크기보다 많은 수의 값을 저장할 수 없다.
        String[] arrayObj = new String[2];
         arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; error
        for(int i = 0; i < arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }

        // ArrayList 는 크기를 미리 지정하지 않기 때문에 얼마든지 많은 수의 값을 저장할 수 있다.
        // 배열과 ArrayList 의 차이는 배열은 인덱스 번호를 사용해 값을 가져왔지만 컬렉션은 get(indexNumber)을 사용한다.
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("one");
        a1.add("two");
        a1.add("three");
        /*
        ArrayList 메소드의 add 는 인자를 Object 로 받고 있다. 무엇이 값으로 들어올지 모르기 때문이다.
        그렇기 때문에  데이터형을 () 로 지정해주거나 제네릭을 사용해서 데이터타입을 정해놓으면 된다.
         */
        for(int i = 0; i < a1.size(); i++){
            String value = a1.get(i);
            System.out.println(value);
        }
    }
}
