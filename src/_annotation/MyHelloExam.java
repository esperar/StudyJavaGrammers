package _annotation;
import java.lang.reflect.Method;
public class MyHelloExam {
    public static void main(String[] args) {
        MyHello hello = new MyHello();
        try {
            // getClass 인스턴스화 된 클래스의 정보를 리턴 , getDeclaredMethod 입력 받은 정보의 메서들르 리턴
            Method method = hello.getClass().getDeclaredMethod("hello"); // hello 클래스에 hello 라는 메서드를 가져옴
            if(method.isAnnotationPresent(Count100.class)){
                // Count100 이라는 어노테이션이 달려있으면 100번 실행
                for(int i = 0; i < 100; i++){
                    hello.hello();
                }
            } else {
                hello.hello();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
