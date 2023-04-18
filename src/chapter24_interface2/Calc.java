package chapter24_interface2;

public interface Calc {

    // 앞에 자동으로 public static final 처리가 되어 상수가 된다.
    double PI = 3.14;
    int ERROR = -9999999;

    // 앞에 자동으로 pulbic abstract가 붙는다.
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 메서드
    default void description() {
        myMethod();
        System.out.println("정수를 계산합니다.");
    }

    // private 메서드
    private void myMethod() {
        System.out.println("private method");
    }

    // 정적 메서드
    static int total(int[] arr) {
        myStaticMethod();
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

    // private 정적 메서드
    private static void myStaticMethod() {
        System.out.println("private static method");
    }
}
