package _exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    /*
    다중 catch 문을 사용한다 에러를 좀더 세부적으로 검출해 다양한 상황에서 쉽게 대처할 수 있다.
     */
    public void z(int first , int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
            /*
            finally 는 try 부분의 코드 실행이 예외가 발생했건 안했건 무조건 실행되는 부분이다.
            사용 : 데이터베이스에 대한 접속을 끊어주기위해 사용한다.(누적 제거)
             */
            System.out.println("finally");
        }
    }
}


public class exceptionDemo {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0); // ArrayIndexOutofBoundsException finally
        a.z(1,0); // by zero ArithmeticException finally
        a.z(2,1); // 2 finally
    }
}
