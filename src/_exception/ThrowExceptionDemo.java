package _exception;
import java.io.*;

class B {
    // throws <보내고싶은에러>
    void run() throws FileNotFoundException , IOException{
        BufferedReader bReader = null;
        String input = null;
        // 파일을 읽어와 출력하는 로직
        bReader = new BufferedReader(new FileReader("src/_exception/out.txt"));

        input = bReader.readLine();

        System.out.println(input); // 1234
    }
}
class C {
    /*
    사용 순서
    B > C > Throw > 일반사용

    Throw 의 기능 : 예외의 처리를 다음 사용자에게 넘길 수 있다.
     */
    void run() throws FileNotFoundException , IOException{
        /*
        throws 로 넘겨받은 에러를 처리함
         */
        B b = new B();
        b.run(); // 1234
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
        /*
        FileNotFoundException 은 IOException 에 포함되어있다다
        */
        C c = new C();
        try {
            c.run(); // 1234
        } catch(FileNotFoundException e){
            System.out.println("out.txt 파일이 필요합니다");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
