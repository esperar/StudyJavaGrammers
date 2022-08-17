package _Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString()); // 현재 시간 출력

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz"); // 년도 월 일 시간 분 초 오전/오후 지역 표현식

        System.out.println(ft.format(date)); // date의 시간을 SimpleDateFormat에서 정의한 것 처럼 출력가능.

        System.out.println(date.getTime()); // 현재 시간을 long으로 구하는 방법 getTime을 사용한다. (date가 생성된 시간 구하기)

        long today = System.currentTimeMillis(); // System.currentTimeMillis() 를 사용한다. (시스템의 현재시간 구하기)
        System.out.println(today);

        System.out.println(today - date.getTime()); // 시간끼리 연산이 가능하다. 이 것은 시스템이 작업이 처리된 시간을 구할때 쓸 수 있다.
    }
}
