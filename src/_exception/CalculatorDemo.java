package _exception;

class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    /*
    try ... catch는 예외에서 핵심적인 역할을 담당하는 문법이다.
    try {
        예외에 발생이 예상되는 로직
    } catch(예외클래스 인스턴스){
        예외게 발생했을때 실행할 로직
    }
    */
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n : "+e.getMessage());
            System.out.println("\n\ne.toString()\n" + e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
            /*
            e.getMessage()
            - 오류에 대한 기본적인 내용을 출력해준다. 상세하지 않다.

            e.toString()
            - e.getMessage()보다 더 자세한 예외 정보를 제공한다.

            e.printStackTrace()
            -  printStackTrace는 리턴값이 없다. 이 메소드를 호출하면 메소드가 내부적으로 예외 결과를 화면에 출력한다.
               printStackTrace는 가장 자세한 예외 정보를 제공한다.

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
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10,0);
        c1.divide(); // 계산결과는 오류가 발생했습니다 : /by zero

        Calculator c2 = new Calculator();
        c2.setOprands(10,5);
        c2.divide(); // 2
    }
}
