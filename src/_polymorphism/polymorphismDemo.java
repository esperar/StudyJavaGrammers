package _polymorphism;

class O {
    /*
     다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다.
     */
    public void a(int param){
        System.out.println("정수형");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("문자열출력");
        System.out.println(param);
    }
}
public class polymorphismDemo {
    public static void main(String[] args) {
        O o1 = new O();
        o1.a(1);
        o1.a("hello");
    }
}
