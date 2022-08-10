package _Object;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    /*
    자식 클래스는 부모 클래스의 특징을 사용할 수 있지만 부모 클래스는 자식 클래스의
    특징을 사용할 수 없다 그렇기 때문에 새로운 Student s 에 넣는 obj 를 Student 로 형변환을 시켜
    새로운 객체를 만든다.
     */

    public boolean equals(Object obj){
        Student s = (Student)obj; // obj Student 로 형변환
        return name == s.name;
    }

}

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2); // false 둘은 다른 객체이기 때문이다
        System.out.println(s1.equals(s2)); // true
    }
}
