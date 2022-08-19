package _annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 프로그램이 실행될때를 감지할 어노테이션
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

}
