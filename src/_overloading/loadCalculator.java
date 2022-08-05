package _overloading;

class Calculator{
    int left, right;
    int third = 0;
    /*
    오버로딩 : 메서드의 이름이 같아도 매개변수 개수가 다르면 사용 가능. 이 기능을 사용하는 것
    이름을 여러개 만들 수고가 줄어듬 , 사용자의 입장에서 편리하게 사용가능
    + 매개변수의 형식이 같고 메소드의 이름이 같으면서 리턴값이 다르면 메소드는 오버로딩 되지 않는다.
      >> 메소드를 사용하는 단계에서 알려줄 수 있는 정보가 아니라서 사용 후에 확인이 가능하기때문에 불가능
    */
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        this.setOprands(left, right); // 중복 제거 인자가 두개인 코드를 먼저 호출
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class loadCalculator {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20); // 인자가 두개인 oprands 실행
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30); // 인자가 세개인 oprands 실행
        c1.sum();
        c1.avg();

    }

}