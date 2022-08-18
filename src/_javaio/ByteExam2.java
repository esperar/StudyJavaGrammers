package _javaio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam2 {
    public static void main(String[] args) {
        /*
        try-with-resources 블럭 선언
        java io 객체는 인스턴스를 만들고, 모두 사용하면 close()메소드를 호출해야 한다.
        close()메소드를 사용자가 호출하지 않더라도, Exception 이 발생하지 않았다면 자동으로 close()가 되게 할 수 있는 방법
         */
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt")); // io 객체 선언
                ){
            // io 객체 사용
            out.writeInt(100); // write 메서드도 형을 지정할 수 있다.
            out.writeBoolean(true);
            out.writeDouble(2.5);

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
