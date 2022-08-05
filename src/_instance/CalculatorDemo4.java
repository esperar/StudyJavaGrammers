package _instance;
class Calculator{
    int left , right;

    /* class와 메서드의 이름이 같은게 중요
     생성자라고 한다, constructor
     생성자의 역할은 클래스가 생성될때 자동으로 먼저 실행되게 약속되어있다.
     생성자의 로직은 가장 먼저 실행되기때문에 초기화작업을 할 수 있다.
     즉 : 인스턴스를 생성하는 자...? >> 생성자
     */
    public Calculator(int left , int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right);
    }
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
public class CalculatorDemo4 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator(10,20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20,40);
        c2.sum();
        c2.avg();
    }
}
