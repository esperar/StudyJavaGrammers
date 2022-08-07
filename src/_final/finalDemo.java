package _final;
/*
추상이 상속을 강제하는 것이라면 final은 상속/변경을 금지하는 규제이다.
 */

class A{
    final void b(){
        System.out.println("hello");
    }
}

class B extends A{
    // void b() {} overriding 불가
}

final class C{

}

// class D extends C{} final 클래스라 확장 불가능

public class finalDemo {
    public static void main(String[] args) {

    }
}
