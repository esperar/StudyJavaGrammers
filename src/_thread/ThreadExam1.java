package _thread;

public class ThreadExam1 {
    public static void main(String[] args) {
        // MyThread 인스턴스를 2개 만든다.
        Mythread1 t1 = new Mythread1("*");
        Mythread1 t2 = new Mythread1("-");

        // 스레드를 생성하고 스레드 클래스가 가지고있는 start 메서드를 호출 하면된다.
        t1.start();
        t2.start();
        System.out.println("Done !!");
        // 출력 결과는 Done !! 이 찍혔음에도 t1 t2 가 계속해서 실행된다.
    }
}
