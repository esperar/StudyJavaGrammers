package _abstract;
abstract class A {
    public abstract int b();
    /*
    본체가 있는 메소드는 abstract 키워드를 가질 수 없다
    public abstract void c(){System.out.println("hi")}; error !
    추상클래스 내에는 추상메소드가 아닌 메소드가 존재할 수 있다.
     */
    public void d(){
        System.out.println("hello");
    }
}

class B extends A{
    /*
    추상 메소드는 상속 클래스에서 오버라이딩 해서 사용해야한다.
     */
    public int b(){
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        // A b1 = new A(); error
        B b1 = new B();
        b1.d();
        b1.b();

    }
}
