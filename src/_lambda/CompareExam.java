package _lambda;

public class CompareExam {
    public static void exec(Compare compare) {
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k, m);
        System.out.println(value);
    }
    //Compare 인터페이스를 이용하는 클래스
    //Compare 인터페이스를 받아들인 후, 해당 인터페이스를 이용하는 exec 메소드
    //compareTo 메소드가 어떻게 구현되어 있느냐에 따라서 출력되는 값이 다름

    public static void main(String[] args) {
        exec((i,j) ->  {
            return i - j;
        });
    }
}
