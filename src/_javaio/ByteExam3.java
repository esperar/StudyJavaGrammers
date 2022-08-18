package _javaio;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam3 {
    public static void main(String[] args) {
        try(
                DataInputStream in = new DataInputStream(new FileInputStream("date.txt"));
                ){
            // input 은 read 메서드를 통해 데이터를 읽어올 수 있다.
            int i = in.readInt(); // 정수형 데이터를 읽어오기.
            boolean b = in.readBoolean(); // 불린형 데이터를 읽어오기.
            double d = in.readDouble(); // 실수형 데이터 읽어오기.

            System.out.println(i);
            System.out.println(d);
            System.out.println(b);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
