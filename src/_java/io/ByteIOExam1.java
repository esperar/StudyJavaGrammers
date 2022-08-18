package _java.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteIOExam1 {
    public static void main(String[] args) {
        FileInputStream fis = null; // 파일로 부터 읽어오기 위한 객체 생성
        FileOutputStream fos = null; // 파일에 쓸 수 있게 해주는 객체를 생성

        // 메서드가 시작 됐을때 시간을 구하기 위함
        long startTime = System.currentTimeMillis();

        try {
            fis = new FileInputStream("src/_java.io/ByteIOExam1");
            fos = new FileOutputStream("byte.txt");

            // read 메소드는 리턴타입이 정수인데, 정수 4바이트중 마지막 바이트에 읽어드린 1바이트를 저장한다.
            // 더이상 읽어들일 것이 없으면 -1을 리턴한다.
            int readCount = -1;
            // 어차피 os 에서는 512바이트씩 읽어오기때문에 파일을 읽을때 512 만큼 읽어오게 설정해주는게 좋다.
            byte[] buffer = new byte[512];
            while((readCount = fis.read(buffer)) != -1){ // 512 byte 씩 읽어오기
                fos.write(buffer,0,readCount); // 읽은 데이터를 쓰기 ( buffer 의 0번째 부터 readCount 만큼 쓴다.)
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

        //메소드가 끝났을때 시간을 구하기 위함.
        long endTime = System.currentTimeMillis();
        //메소드를 수행하는데 걸린 시간을 구할 수 있음.
        System.out.println(endTime-startTime);
    }
}
