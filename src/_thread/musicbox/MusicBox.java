package _thread.musicbox;

// 공유 객체 MusicBox
public class MusicBox {
    // synchronized 공유객체가 가진 메서드를 동시에 호출 되지 않도록 하는 방법
    // 여러개의 스레드들이 공유 객체의 메소드를 사용할 때 메소드에 synchronized가 붙어 있을 경우
    // 먼저 호출한 메소드가 객체의 사용권을 얻는다.
    public synchronized void playMusicA(){
        for(int i = 0; i < 10; i++){
            System.out.println("신나는 음악!");
            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB(){
        for(int i = 0; i < 10; i++){
            System.out.println("슬픈 음악");
            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    /*
    synchronized를 메소드에 붙혀서 사용 할 경우, 메소드의 코드가 길어지면,
    마지막에 대기하는 쓰레드가 너무 오래 기다리는것을 막기위해서 메소드에 synchronized를 붙이지 않고,
    문제가 있을것 같은 부분만 synchronized블록을 사용한다.
     */
    public void playMusicC(){
        for(int i = 0; i < 10; i++){
            // 이 부분만 동시에 호출되지 않게 처리
            synchronized (this) {
                System.out.println("카페 음악!");
            }
            try{
                Thread.sleep((int)(Math.random() * 1000));
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
