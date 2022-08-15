package _JavaLang.StringAuto;

public class StringClassDemo {
    public static void main(String[] args) {
        String str4 = "Hello World";
        String str5 = str4.substring(5); // 5번째 부터 가져옴
        System.out.println(str5); //  World

        String str6 = str4 + str5; // Hello World World 가 저장
        // 문자열과 문자열을 더하게 되면 내부적으로 스트링버퍼가 하나씩 생김
        // String str4 = new StringBuffer().append(str1).append(str2).toString(); 이 로직이 실행됨
        // 그래서 문자열을 더하는 것은 성능상에 문제가 생길 수 있음. 대신 append()를 사용하도록 하자
    }
}
