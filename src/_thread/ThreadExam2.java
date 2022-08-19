package _thread;

public class ThreadExam2 {
    public static void main(String[] args) {
        Mythread2 r1 = new Mythread2("*");
        Mythread2 r2 = new Mythread2("-");

        // Runnable 로 만든 스레드는 Thread를 상속받지 않았기 때문에 스레드가 아니다.
        // 그렇기 때문에 Thread 를 생성하고 해당 생성자에 Mythread2를 넣어서 쓰레드를 생성한다.
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
        System.out.println("done");
    }
}
