package _thread.musicbox;

public class MusicBoxExam1 {
    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer kim = new MusicPlayer(1,box);
        MusicPlayer lee = new MusicPlayer(2,box);
        MusicPlayer kang = new MusicPlayer(3,box);

        // 뮤젝플레이어의 쓰레드를 실행
        kim.start();
        lee.start();
        kang.start();
    }
}
