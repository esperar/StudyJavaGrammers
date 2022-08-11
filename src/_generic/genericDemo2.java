package _generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person2<T, S>{
    public T info;
    public S id;
    Person2(T info, S id){
        // info 안에는 EmployeeInfo(1) 로 생성한 object 가 들어간다.
        // id 안에는 integer 로 변환하여 받은 10이 들어가게 된다.
        this.info = info;
        this.id = id;
    }
}
public class genericDemo2 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        // 제네릭 안에는 원시형 데이터타입이 들어갈 수는 있으나 제네릭에 넣으려면 wrapper 클래스를 사용해야한다
        // wrapper 클래스는 기본 데이터 타입을 참조 데이터 타입으로 변환해주는 역할을 한다
        Integer i = new Integer(10);
        Person2<EmployeeInfo, Integer> p1 = new Person2<EmployeeInfo, Integer>(e, i);
        // intValue()는 wrapper 클래스가 담고 있는 숫자를 원시데이터 타입으로 되돌려주는 메서드입니다.
        System.out.println(p1.id.intValue()); // 10
    }
}