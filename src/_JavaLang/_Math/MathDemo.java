package _JavaLang._Math;

public class MathDemo {
    public static void main(String[] args) {
        // Math 클래스는 객체가 private 라서 new 연산자를 사용해 객체를 생성할 수 없다.
        // 하지만 Math 클래스의 메서드는 static 으로 생성되어있기 때문에 직접 생성하지 않아도 사용할 수 있다.
        System.out.println(Math.max(5,30)); // 30 최댓값 구하기
        System.out.println(Math.min(5,30)); // 5 최소값 구하기
        System.out.println(Math.abs(-10)); // 10 절대값 구하기
        System.out.println(Math.random()); // 0 ~ 1 사이의 난수 출력
        System.out.println(Math.sqrt(25)); // 5 제곱근 출력
    }
}
