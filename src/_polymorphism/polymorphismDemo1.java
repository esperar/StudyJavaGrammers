package _polymorphism;

class A{
    public String x(){
        return "A.x";
    }
}

class B extends A{
    public String x(){
        return "B.x";
    }

    public String y(){
        return "y";
    }
}

class B2 extends A{
    public String x(){
        return "B2.x";
    }
}
/*
 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 때
 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다.
 동시에 클래스 B에서 오버라이딩한 맴버의 동작방식은 그대로 유지한다.
 A에 존재하지 않은 메소드는 사용할 수 없다.
 */
public class polymorphismDemo1 {
    public static void main(String[] args) {
        // 클래스의 다형성
        A obj = new B();
        System.out.println(obj.x()); // B.x
        // obj.y() error !!
        A obj2 = new B2();
        System.out.println(obj2.x()); // B2.x
    }
}
