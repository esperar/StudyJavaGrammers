package _lambda;

//2개의 값을 비교하여 어떤 값이 더 큰지 구하는 compareTo()라는 메소드를 가지고 있는 Compare 인터페이스
//2개의 값을 받아들인 후, 정수를 반환하는 메소드를 선언
public interface Compare {
    public int compareTo(int value1, int value2);
}
