package _exception;

class A{
    private int[] arr = new int[3]
    A(){
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    /*
    다중 catch문을 사용한다 에러를 좀더 세부적으로 검출해 다양한 상황에서 쉽게 대처할 수 있다.
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
        }
    }
}


public class exceptionDemo {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 0); // ArrayIndexOutofBoundsException
        a.z(1,0); // by zero ArithmeticException
        a.z(2,1); // 2
    }
}
