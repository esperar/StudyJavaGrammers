package _exception;

import java.io.IOException;

class E {
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException1(){
        try {
            throw new IOException();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    /*
    IOException 은 try...catch 하거나 throw 해야 한다 왜 그럴까 ?
    IOException 의 부모중에는 RuntimeException 이 없다(checked)
    - 반드시 try .. catch 나 throw 로 예외를 처리해야한다
    부모중에 RuntimeException 이 있다 (checked)
    - 예외처리를 할 필요가 딱히 없다
    */

    void throwIOException2() throws IOException{
        throw new IOException();
    }
}

public class example {
    public static void main(String[] args) {

    }
}
