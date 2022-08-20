package _lambda;

public class lambdaExam1 {

    public static void main(String[] args) {
        // Runnable 인터페이스의 경우 하나의 메서드 run 만 가지고 있다.
        // 쓰레드가 실행되면 쓰레드 생성자 안에 넣은 run 메서드가 실행이 된다.
        // 자바는 메소드만 매개변수로 전달할 방법이 없다. 인스턴스만 전달할 수 있다.
        // 그렇기 때문에 run 메서드를 가지고 있는 Runnable 객체를 만들어 전달한다.
        new Thread(new Runnable(){public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }}).start();

        // 메서드만 전달할 수 있다면, 좀더 편리하게 프로그래밍을 할 수 있을 것이다.
        // 자바는 메서드만 전달할 수 있는 방법은 없었기 때문에 매번 객체를 생성해 매개변수로 전달해야했다.
        // 이런 부분을 해결한 것이 람다 표현식이다.
        new Thread(()->{
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }
}
