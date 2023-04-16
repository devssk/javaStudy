package chapter3_primitiveVariable;

// 상수(constant)
// 상수는 변하지 않는 수
// final 예약어를 사용하여 선언
// 상수를 사용하면 변하지 않는 값을 반복하여 사용할 때 의미있는 문자로 인식하기 쉽고
// 변하더라도 선언한 부분만 변경하면 되므로 여러부분을 수정할 필요가 없다
// 영문자 대문자를 사용하여 변수명을 짓는다
// 리터럴(literal)
// 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻한다.
// 리터럴은 상수 풀(constant pool)에 있다.
// 정수 리터럴은 int, 실수 리터럴은 double로 저장된다.
// 따라서 정수의 범위(int의 범위)가 넘어갈때는 L(l)을, 실수의 경우 float를 사용하려는 경우는 F(f)식별자를 써줘야 한다.
public class ConstantTest {
    public static void main(String[] args) {
        // 선언과 초기화
        final int MAX_NUM = 100;
        // 선언만 하고 이후에 초기화를 하여도 됨
        final int MIN_NUM;
        MIN_NUM = 0;
        System.out.println("MAX_NUM = " + MAX_NUM);
        System.out.println("MIN_NUM = " + MIN_NUM);
//        MAX_NUM = 1000; -> 이미 초기화가 되었으므로 값을 변경할 수 없음

    }
}
