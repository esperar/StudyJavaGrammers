package _Object;

/*
Cloneable 의 인터페이스를 보면 비어있다. 그럼에도 불구하고 이것을 사용하는 이유는
Student 클래스가 복제 가능하다는 것을 표시하기 위해서다.
 */
class Student2 implements Cloneable{
    String name;
    Student2(String name){
        this.name = name;
    }
    /*
    clone 은 exception 을 throw 하거나 try...catch 를 해야한다.
     */
    protected Object clone() throws CloneNotSupportedException{
        return super.clone(); // Object 객체 중에서 clone(); 을 사용
    }
}

public class cloneDemo {
    public static void main(String[] args) {
        Student2 s1 = new Student2("egoing");
        try {
            Student2 s2 = (Student2)s1.clone();
            System.out.println(s1.name); // "egoing" 둘이 같은 인자를 갖고있음을 볼 수 있음
            System.out.println(s2.name); // "egoing"
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
