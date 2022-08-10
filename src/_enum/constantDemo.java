package _enum;

/*
 변하지 않는 상수를 지정했다. 하지만 상수의 값이 같다면
 Fruit 의 APPLE 과 Company 의 APPLE 은 같아지는가 ? 아니다.
 그 문제를 해결하기 위하여 클래스로 지정을해 각 상수들이 자기자신을 인스턴스화 시키게 하였다.
 그로인해 Fruit 의 APPLE 과 Company 의 APPLE 은 비교 조차 할 수 없게 되었다.
 */
/*
class Fruit{
    public static final Fruit APPLE = new Fruit();
    public static final Fruit PEACH = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
 */
/*
enum 은 interface , class 와 같은 형식을 가진다 그렇지만 enum 은 사실상 class 와 같다
enum 만을 위한 문법 형식이 제공 되는것 뿐이지 class 로도 구현할 수도 있다.
enum 사용 이유
- 코드가 단순해진다
- 인스턴스 생성과 상속을 방지하다
- 키워드 enum을 사용하기 때문에 구현의 의도가 열거임을 분명하게 나타낼 수 있다.
 */
enum Fruit{
    APPLE , PEACH , BANANA
}
enum Company{
    GOOGLE , APPLE , ORACLE
}

public class constantDemo {
    public static void main(String[] args) {
        // if(Fruit.APPLE == Company.APPLE)  비교 자체가 불가능..

        Fruit type = Fruit.APPLE;
        switch (type){
            case APPLE :
                System.out.println("57 kcal");
                break;
            case BANANA:
                System.out.println("34 kcal");
                break;
            case PEACH:
                System.out.println("93 kcal");
                break;
        }

    }
}
