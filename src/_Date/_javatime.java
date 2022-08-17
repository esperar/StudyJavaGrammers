package _Date;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

/*
Java에서 제공하는 Date, Time API는 부족한 기능 지원을 포함한 여러가지 문제점을 가지고 있었다.
JDK 코어에서 이런 문제점들을 해결하고 더 좋고 직관적인 API들을 제공하기 위해 새롭게 재 디자인한 Date, Time API를 Java SE 8부터 제공한다.
 */

public class _javatime {
    public static void main(String[] args) {
        LocalDateTime timePoint = LocalDateTime.now(); // 현재 시간을 구한다.

        // 원하는 시간으로 Time 객체 생성하기
        LocalDate ld1 = LocalDate.of(2012 , Month.DECEMBER , 12); // 2012.12.12
        LocalTime ld2 = LocalTime.of(17,18); // 17:18]

        // 현재 날짜와 시간정보를 getter을 사용해서 구현하는 방법.
        LocalDate theDate = timePoint.toLocalDate();
        Month month = timePoint.getMonth();
        int day = timePoint.getDayOfMonth();
        int hour = timePoint.getHour();
        int minute = timePoint.getMinute();
        int second = timePoint.getSecond();

        // 달을 숫자로 출력한다 1월도 1부터 시작하는 것을 알 수 있습니다.
        System.out.println(month.getValue() + "/" + day + "  " + hour + ":" + minute + ":" + second);
    }
}
