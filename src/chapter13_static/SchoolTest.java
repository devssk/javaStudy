package chapter13_static;

import java.util.Calendar;

// 싱글톤 패턴(singleton patten)
// 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우 사용하는 디자인 패턴
// static 변수, 메서드를 활용하여 구현 할 수 있음
public class SchoolTest {
    public static void main(String[] args) {
        School school1 = School.getInstance();
        School school2 = School.getInstance();

        System.out.println(school1 == school2);

        Calendar calendar = Calendar.getInstance();
    }
}
