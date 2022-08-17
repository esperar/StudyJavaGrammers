package _java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam1 {
    public static void main(String[] args) {
        FileInputStream fis = null; // 파일로 부터 읽어오기 위한 객체 생성
        FileOutputStream fos = null; // 파일에 쓸 수 있게 해주는 객체를 생성

        try {
            fis = new FileInputStream("src/_java.io/ByteIOExam1");
            fos = new FileOutputStream("byte.txt");

            // read 메소드는 리턴타입이 정수인데, 정수 4바이트중 마지막 바이트에 읽어드린 1바이트를 저장한다.
            // 더이상 읽어들일 것이 없으면 -1을 리턴한다.
            int readDate = -1;
            while((readDate = fis.read()) != -1){
                fos.write(readDate); // 읽은 데이터를 쓰기
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

            try{
                fos.close();
            } catch(IOException e){
                e.printStackTrace();
            }

            try{
                fis.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
