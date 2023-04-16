package chapter3_primitiveVariable;

// 지역변수를 자료형 없이 사용하기 (java 10 이후부터)
// Local variable type inference
// 추론 가능한 변수에 대한 자료형을 선언하지 않음
// 컴파일 시점에 추론된다
// 한번 선언하여 추론 된 변수를 다른 타입의 값을 대입 할 수 없다.
// 지역 변수만 선언 가능
// 반드시 변수를 초기화 하여야 한다. -> 어떤값인지 확인하고 추론해야하기 때문
// null을 넣을 수 없다.
public class LocalVariableTest {
    public static void main(String[] args) {
        var i = 10;
        var d = 10.0;
        var str = "hello";
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("str = " + str);

        str = "hi";
        System.out.println("str = " + str);
//        str = 1; -> 다른 타입의 자료를 넣을 수는 없다.

    }
}
