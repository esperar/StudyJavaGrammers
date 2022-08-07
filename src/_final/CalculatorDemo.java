package _final;

class Calculator {
    static final double PI = 3.14;
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        // Calculator.PI = 6; 변경 불가능
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI); // 3.14
        //Calculator.PI = 10; error !

    }

}