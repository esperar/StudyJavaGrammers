package _thread;

// 쓰레드를 생성하기 위해선 Thread 클래스를 상속받는다.
public class Mythread1 extends Thread{
    String str;
    public Mythread1(String str){
        this.str = str;
    }
    // Thread가 가지고있는 run 메소드를 오버라이딩 해야한다.
    public void run(){
        // 10번 반복하면서 str을 찍는 메서드
        for(int i = 0; i < 10; i++){
            System.out.println(str);
            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
