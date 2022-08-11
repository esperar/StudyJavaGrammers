package _generic;

interface Info{
    int getLevel();
}
class EmployeeInfo2 implements Info{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
/*
Generic 안에서 extends 는 상속의 개념이 아닌 부모를 지정해주는 것을 뜻한다.
Info 로 지정해주지 않으면 T 는 기본으로 Object 로 지정되기 때문에 메서드 getLevel() 을 사용할 수 없다.
 */
class Person3<T extends Info>{
    public T info;
    Person3(T info){ this.info = info; }
}
public class genericDemo3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3(new EmployeeInfo2(1));
        // Person3<String> p2 = new Person3<String>("부장");
    }
}