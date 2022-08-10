package _Object;

/*
class Calculator 는  class Calculator extends Object 랑 같은 의미이다
즉 자바에서 Object 라는 객체에서 상속을 받는 것이고 Object 안의 메소드들을 사용할 수 있으며
오버라이딩도 할 수 있다는 뜻이다.
 */
class Calculator{
    int left, right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }

    public void avg(){
        System.out.println((this.left+this.right)/2);
    }

    public String toString(){
        return super.toString() +"left : " +this.left + ", right : "+ this.right;
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1);
        // toString(); 메서드는 객체의 위치를 문자열로 출력해줍니다.
        System.out.println(c1.toString());
    }

}