package _exception;

class DivideException extends ArithmeticException {

    public int left;
    public int right;
    DivideException(){
        super();
    }
    DivideException(String message , int left, int right) {
        super(message);
        this.left = left;
        this.right = right;
    }
}

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    /*
    try ... catch 는 예외에서 핵심적인 역할을 담당하는 문법이다.
    try {
        예외에 발생이 예상되는 로직
    } catch(예외클래스 인스턴스){
        예외게 발생했을때 실행할 로직
    }
    */
    public void divide(){
        // right 에 0 이 들어올때 오류 출력
        if(right == 0){
            // 메인의 catch 안에있는 인자로 exception 의 인자를 리턴한다.
            throw new DivideException("0 으로 나눌 수 없습니다." , this.left, this.right);
        }
        System.out.println(this.left/this.right);

            /*
            e.getMessage()
            - 오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.

            e.toString()
            - e.getMessage()보다 더 자세한 예외 정보를 제공한다.

            e.printStackTrace()
            -  printStackTrace 는 리턴값이 없다. 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다.
               printStackTrace 는 가장 자세한 예외 정보를 제공한다.

            [출력 결과]
            계산결과는

            e.getMessage()
            / by zero


            e.toString()
            java.lang.ArithmeticException: / by zero


            e.printStackTrace()
            java.lang.ArithmeticException: / by zero
                at org.opentutorials.javatutorials.exception.Calculator.divide(CalculatorDemo.java:11)
                at org.opentutorials.javatutorials.exception.CalculatorDemo.main(CalculatorDemo.java:25)

             */
        }
    }
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,0);
        try{
            c1.divide();
            // c1.divide()에서 예외게 발생하면 메인의 catch 구문을 찾아 메소드처럼 실행한다.
        } catch(DivideException e){
            System.out.println(e.getMessage()); // "0으로 나눌 수 없습니다."
            System.out.println(e.left);
            System.out.println(e.right);
        }

    }
}
