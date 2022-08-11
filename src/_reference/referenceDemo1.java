package _reference;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class referenceDemo1 {

    /*
    아래의 데이터 타입들은 참조형이 아니기때문에 b의 값을 바꾸어도 a값이 유지된다.
    이러한 원시형 데이터형 변수는 복제형 데이터 타입이다.
     */
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue" + a);
    }

    public static void runReference(){
        /*
        생성자를 통해 인스턴스화 한 변수는 참조형 데이터이다.
        a b는 A의 정보를 가르키고 있다. 그렇기 때문의 둘은 같은
        클래스의 정보를 사용하는 것이며 b를 통해 값을 바꾸면 a도 똑같이 적용이 된다.
        이러한 기법을 참조라고 한다.
         */
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println(a.id); // 2

    }

    public static void main(String[] args) {
        runValue(); // 1
    }
}
