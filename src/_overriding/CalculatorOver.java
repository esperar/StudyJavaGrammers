package _overriding;

class Calculator {
    int left, right;

    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public int avg() {
        return((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left,right);
    }

    // 부모와 자식의 리턴 데이터타입이 일치하지 않으면 오류가 발생한다.
    // 메소드의 이름도 같아야한다 , 매개변수의 수와 타입 ,순서도 같아야한다.
    /*
    public void avg(){
        System.out.println((this.left + this.right) / 2 )
    }
    */
    public int avg(){
        return super.avg(); // 부모 객체가 갖고있는 메소드를 호출 , 중복의 제거
    }
    public void substract() {
        System.out.println(this.left - this.right);
    }

    // 부모클래스가 가진 메소드는 무시가 되고 자식 클래스가 가진 메소드가 실행되는것이
    // 메소드 오버라이딩이다.
    public void sum(){
        System.out.println("합은" + (this.left + this.right));
    }
}

public class CalculatorOver {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum(); // 합은 30
        c1.avg();
        c1.substract();

    }
}