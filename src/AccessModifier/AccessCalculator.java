package AccessModifier;


/*
 접근 제어자를 사용하며 내부 로직은 private로 설정하여
 외부에서 건들지 못하도록 잘못된 값을 입력하면 에러가 뜰 수 있게 하도록 해준다.
 */
class Calculator{
    int left , right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return this.left + this.right;
    }
    public void sumDecoPlus(){
        System.out.println("+++" + _sum() + "+++");
    }

}

public class AccessCalculator {
    public static void main(String[] args) {
    Calculator c1 = new Calculator();
    c1.setOprands(10,20);
    c1.sumDecoPlus(); // +++30+++
    }
}
