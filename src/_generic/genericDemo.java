package _generic;

/*
 제네릭이란 클래스 내부에서 사용할 데이터의 타입을 외부에서 미리 지정하는 기법이다.
 아래에서 T로 데이터 타입을 입력 받는다 그리고 그 데이터 타입을 가지고있는 info 가 생성된다.
 */

class Person<T>{
    public T info;
}

public class genericDemo {
    public static void main(String[] args) {
        // 제네릭으로 클래스를 생성하기 위하여 생성자를 사용해주었고 T가 들어갈 자리에 데이터 형을 쓰면
        // 그에 맞는 데이터형으로 info 가 생성이 된다.
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
    }
}
