package Basic.scope;

class C {
    int v = 10;
    void m(){
        int v = 20;
        System.out.println(v); // 20
        System.out.println(this.v); // 10
        /*
        this가 있다 >> 인스턴스 그 자체를 의미한다 ,
        this가 붙으면 그 객체에대한 전역의 의미를 갖는다.
        */
    }
}

public class thisScope {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}
