package _polymorphism;
interface I2{
    public String A();
}
interface I3{
    public String B();
}

class D implements I2 , I3{
    public String A(){
        return "A";
    }

    public String B(){
        return "B";
    }
}
public class polymorphismDemo2 {
    public static void main(String[] args) {
    D obj = new D();
    obj.A();
    obj.B();

    I2 obj2 = new D();
    obj2.A();
    // obj2.B(); error

    I3 obj3 = new D();
    // obj3.A(); error
    obj3.B();
    }
}
