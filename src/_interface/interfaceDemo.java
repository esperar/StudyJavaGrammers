package _interface;

interface I{
    public void z();
}
/*
인터페이스는 하위 클래스에 특정한 메소드가 반드시 존재하도록 강제한다.
클래스의 확장은 extends 였지만 인터페이스의 확장은 implements 를 사용한다
인터페이스를 이용해서 서로가 동일한 메소드를 만들도록 규약을 만들어서 공유한 결과
각자가 상대의 일정이나 구현하는 방식에 덜 영향을 받으면서 애플리케이션을 구축 할 수 있다.
 */


class A implements I{
    public void z(){

    };
}

/*
인터페이스 규칙
1. 하나에 클래스에서 여러개의 인터페이스를 사용할 수 있다
2. 인터페이스도 상속이 된다.
3. 인터페이스의 멤버는 반드시 public 여야 한다

abstract interface 의  차이는 abstract 는 구체적인 로직이나 상태를 가질 수 있다 반대로
interface 는 가질 수 없다.
 */

public class interfaceDemo {
    public static void main(String[] args) {

    }
}
