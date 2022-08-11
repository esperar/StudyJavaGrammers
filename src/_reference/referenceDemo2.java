package _reference;

public class referenceDemo2 {

    static void _value(int b){
        b = 2;
    }

    public static void runValue(){
        /*
        원시형 데이터 타입의 자료형이기 때문에 복제형이다 그러므로 a 값은 변하지 않는다.
         */
        int a = 1;
        _value(a);
        System.out.println("runValue, "+a); // 1
    }

    static void _reference1(A b){
        // 이곳에서 b는 new A(2) 라는 다른 인스턴스를 참조하고 있다 그렇기 때문에
        // a의 값이랑은 전혀 관계가 없다.
        b = new A(2);
    }

    public static void runReference1(){
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id); 1
    }

    static void _reference2(A b){
        // runReference2 에서 받은 인자로 A b = a; 기능을 수행한다
        // 그렇다면 a 와 b 는 둘다 new A(1) 이라는 같은 인스턴스를 참조하고 있기 때문에
        // b.id 의 값을 바꾸게 된다면 a가 참조하고 있는 값도 바뀌게 된다
        b.id = 2;
    }

    public static void runReference2(){
        A a = new A(1);
        _reference2(a);
        System.out.println("runReference2, "+a.id); // 2
    }

    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }

}