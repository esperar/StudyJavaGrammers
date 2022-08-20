package _thread.musicbox;

public class MusicPlayer extends Thread{
    int type;
    MusicBox musicBox;
    // 생성자로 부터 뮤직박스와 정수를 하나 받아들여 필드를 초기화
    public MusicPlayer(int type, MusicBox musicBox){
        this.type = type;
        this.musicBox = musicBox;
    }
    // type이 무엇이냐에 따라서 뮤직박스가 가지고 있는 메서드가 다르게 호출됨
    public void run(){
        switch (type){
            case 1 : musicBox.playMusicA(); break;
            case 2 : musicBox.playMusicB(); break;
            case 3 : musicBox.playMusicC(); break;
        }
    }
}
