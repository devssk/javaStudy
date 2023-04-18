package chapter22_interface;

public interface Calc {

    // 앞에 자동으로 public static final 처리가 되어 상수가 된다.
    double PI = 3.14;
    int ERROR = -9999999;

    // 앞에 자동으로 pulbic abstract가 붙는다.
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
