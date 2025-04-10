package ex06_annotation;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface TestInter {
    void method1();
}

class TestImp1 implements TestInter {
    @Override
    public void method1() {
        // 메서드 내용 작성
    }
}

// '사용하지 않는 변수' 경고를 억제
@SuppressWarnings({"unused", "unchecked", "deprecation"})
public class Ex01_Annotation {
    public static void main(String[] args) {
        int x = 10;  // 사용되지 않지만 경고를 억제합니다.

        List list = new ArrayList(); // 제네릭 타입 미지정으로 경고 억제

        Integer y = new Integer(10); // Deprecated 경고 억제

        addUser("철수"); // Deprecated 메서드 호출
    }

    // Deprecated 애너테이션을 적용한 메서드
    @Deprecated
    public static void addUser(String name) {
        System.out.println("사용자 추가: " + name + " (이 방식은 올바르지 않습니다.)");
    }
}