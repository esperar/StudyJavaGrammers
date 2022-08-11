package _reference;

public class referenceDemo1 {

    /*
    아래의 데이터 타입들은 참조형이 아니기때문에 b의 값을 바꾸어도 a값이 유지된다.
     */
    public static void RunValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("RunValue" + a);
    }

    public static void main(String[] args) {
        RunValue(); // 1
    }
}
