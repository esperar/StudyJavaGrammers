package _thread;

public class JoinExam1 {
    public static void main(String[] args) {
        Mythread5 t1 = new Mythread5();
        System.out.println("시작");

        t1.start();
        // join() 은 스레드가 종료될때 까지 멈춥니다.
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } // Tip ) 예외처리 단축키 ctrl + alt + T

        System.out.println("종료");
    }
}
