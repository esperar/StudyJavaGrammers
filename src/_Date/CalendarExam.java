package _Date;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        /*
        Calendar는 추상 클래스이다. 그래서 인스턴스를 생성하려면 Calendar가 가지고 있는 getInstance() 라는 메서드를 사용해야한다.
        - getInstance()메소드를 호출하면 내부적으로 java.util.GregorianCalendar 인스턴스를 만들어서리턴한다.
        - GregorianCalendar는 Calendar의 자식 클래스이다.
         */
        Calendar cal = Calendar.getInstance();

        //Calendar는 현재 날짜와 시간에 대한 정보를 가집니다.
        //Calendar가 가지고 있는 get메소드에 Calendar의 상수를 어떤 것을 넣어주느냐에 따라서 다른 값이 나오게 됩니다.
        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1; // 월은 0부터 시작합니다.
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR); // 12시까지로 표현
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 24시까지로 표현
        int minute = cal.get(Calendar.MINUTE);

        cal.add(Calendar.HOUR_OF_DAY , 5); // add 메서드를 사용해 날짜를 조정할 수 있다. (지금 시간 + 5)

    }
}
