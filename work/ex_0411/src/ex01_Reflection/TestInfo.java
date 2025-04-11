package ex01_Reflection;

import static java.lang.annotation.ElementType.*;//ElementType은 열거형 -> 들어있는 것은 전부 상수
import java.lang.annotation.*;
import static java.lang.annotation.RetentionPolicy.*;//RetentionPolicy은 열거형 -> 들어있는 것은 전부 상수


@Target({TYPE,FIELD,TYPE_USE,METHOD})
@Retention(RUNTIME)
public @interface TestInfo {//앞으로 다른곳에서 @TestInfo로 어노테이션을 사용할 수 있다.
	String value();//추상메서드
}