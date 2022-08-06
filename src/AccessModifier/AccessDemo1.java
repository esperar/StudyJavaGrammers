package AccessModifier;
class A {
    public String x(){
        return "public void x()";
    }
    private String z(){
        return "private void z()";
    }
    public String y(){
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x());
        System.out.println(a.y());
        // System.out.println(a.z()); // error!!
    }
}
