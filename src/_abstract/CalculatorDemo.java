package _abstract;

/*
sum과 avg를 함께 실행할때 더욱 편의성있게 사용할 수 있도록 추상클래스로 구현한다.
 */
abstract class Calculator{
    int left , right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    abstract void sum();
    abstract void avg();

    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator{
    public void sum(){
        System.out.println("+ sum" +(this.left + this.right));
    }
    public void avg(){
        System.out.println("+ avg" +((this.left + this.right) / 2));
    }
}

class CalculatorDecoMinus extends Calculator{
    public void sum(){
        System.out.println("- sum" +(this.left + this.right));
    }
    public void avg(){
        System.out.println("- avg" +((this.left + this.right) / 2));
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10,20);
        c1.run(); // + 30  , + 15

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c1.setOprands(10,20);
        c1.run(); // - 30  , - 15
    }
}
