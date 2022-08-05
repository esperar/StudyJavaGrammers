package test;

class Calculator2{
    static int base = 0;
    static double PI = 3.14;
    int left , right;

    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }

    public void sum(){
        System.out.println(this.left+this.right + base);
    }

    public void avg(){
        System.out.println((this.left+this.right + base)/2);
    }
}
public class member {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        System.out.println(c1.PI); // 3.14

        c1.setOprands(20,40);
        c1.sum(); // 60

        // 클래스 변수 base의 값을 10으로 지정
        Calculator2.base = 10;

        c1.sum(); // 70
    }
}
