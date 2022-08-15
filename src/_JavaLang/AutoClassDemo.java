package _JavaLang;

public class AutoClassDemo {
    public static void main(String[] args) {
        // 오토 박싱
        int i =5;
        // Integer i2 = new Integer(7);
        Integer i2 = 7; // 자동으로 객체형으로 만들어줌 오토 박싱
        int i3 = i2; // 자동으로 기본형으로 변환 오토 언박싱

        // String Buffer 아무것도 들어있지 않는 버퍼를 만든다.
        StringBuffer sb = new StringBuffer();
        sb.append("hello"); // append 메서드를 사용하여 문자열 값을 추가한다.
        String str = sb.toString(); // 스트링버퍼 안에 있는 값을 리턴한다.
        System.out.println(str); // hello

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("World");
        if(sb2 == sb3){
            System.out.println("sb2 == sb3"); // 출력됨
        } // 스트링버퍼가 가지고있는 메서드 대부분은 자기 자신(this)을 반환함

        // 자기 자신의 메소드를 호출하여 값을 바꿔나가는 것을 메소드 체이닝 이라고 한다.
        String str2 = new StringBuffer().append("Hello").append(" ").append("World").toString();
        System.out.println(str2); // Hello World
    }
}
