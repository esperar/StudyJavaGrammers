package _inheritance;

/*
상속의 장점은 중복을 제거할 수 있다. 부모의 코드를 다시 작성할 필요가 없다.
상속받는 클래스의 모든 클래스가 개선이 되기때문에 가독성이 증가한다.
재활용성이 증가하고 , 유지보수성이 좋아진다.
*/

class MultiplicationableCalculator extends Calculator {
    /*
    생성자를 사용하여 초기화한다. 상속클래스는 super 사용가능
     */
    public MultiplicationableCalculator(int left, int right){
        super(left,right);
    }
    public void multiplication(){
        System.out.println(this.left * this.right);
    }
}
class DivisionableCalculator extends MultiplicationableCalculator {
    public DivisionableCalculator(int left , int right){
        super(left, right);
    }
    public void division(){
        System.out.println(this.left / this.right);
    }
}
public class multipleCalculator {
    public static void main(String[] args) {
        MultiplicationableCalculator c1 = new MultiplicationableCalculator(10,20);
        c1.multiplication(); // 200

        DivisionableCalculator c2 = new DivisionableCalculator(10,2);
        c2.division(); // 5
    }
}
