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
            System.out.println("오류가 발생했습니다 : "+e.getMessage());
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
