package chapter7_object;

// 함수(function)
// 하나의 기능을 수행하는 일련의 코드
// 구현된 함수는 호출하여 사용하고 호출된 함수는 기능이 끝나면 제어가 반환됨
// 함수로 구현된 하나의 기능은 여러 곳에서 동일한 방식으로 호출되어 사용될 수 있음
// 함수는 이름, 매개변수(parameter), 반환 값, 함수 몸체(body)로 구성됨

// 함수 호출과 스택 메모리
// 스택 메모리 : 함수가 호출될 때 지역 변수들이 사용하는 메모리
// 함수의 수행이 끝나면 자동으로 반환 되는 메모리

// 메서드(method)
// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수
// 멤버 함수(member function)이라고도 함 (C++)
// 메서드를 구현함으로써 객체의 기능이 구현 됨
public class FunctionTest {

    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        int num = calcSum();
        System.out.println(num);

    }
}
