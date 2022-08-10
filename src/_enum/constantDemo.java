package _enum;

/*
 변하지 않는 상수를 지정했다. 하지만 상수의 값이 같다면
 Fruit 의 APPLE 과 Company 의 APPLE 은 같아지는가 ? 아니다.
 그 문제를 해결하기 위하여 클래스로 지정을해 각 상수들이 자기자신을 인스턴스화 시키게 하였다.
 그로인해 Fruit 의 APPLE 과 Company 의 APPLE 은 비교 조차 할 수 없게 되었다.
 */
class Fruit{
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}

class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class constantDemo {
    public static void main(String[] args) {
        // if(Fruit.APPLE == Company.APPLE)  비교 자체가 불가능..
    }
}
