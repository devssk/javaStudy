package chapter24_interface2;

// 상수 -> 모든 변수는 상수로 변환 됨 public static final
// 추상 메서드 -> 모든 선언된 메서드는 추상 메서드 public abstract

// 디폴트 메서드 (java 8 이후)
// 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들에서 공통으로 사용할 수 있는 기본 메서드
// default 키워드 사용
// 구현 하는 클래스에서 재정의 할 수 있음
// 인터페이스를 구현한 클래스의 인스턴스가 생성 되어야 사용 가능함

// 정적 메서드 (java 8 이후)
// 인스턴스 생성과 상관 없이 인터페이스 타입으로 사용할 수 있는 메서드

// private 메서드 (java 9 이후)
// 인터페이스를 구현한 클래스에서 사용하거나 재정의 할 수 없음
// 인터페이스 내부에서만 사용하기 위해 구현하는 메서드
// default 메서드나 static 메서드에서 사용함
public class CalculatorTest {
    public static void main(String[] args) {
        Calc calc = new CompleteCalc();

        int num1 = 10;
        int num2 = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
        System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5};
        int total = Calc.total(arr);
        System.out.println("total = " + total);
    }
}
