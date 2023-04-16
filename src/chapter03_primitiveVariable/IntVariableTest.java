package chapter03_primitiveVariable;

// 자료형(data type)
// 변수가 저장되는 메모리 공간의 특성
// 변수는 쓰임에 맞게 자료형으로 선언해야 한다.
// 변수를 선언하면 해당되는 자료형의 크기 만큼 메모리가 할당된다.
// 변수는 할당된 메로리를 가리키는 이름이다.
// 변수를 선언한다는 것은 선언한 변수 이름으로 어떤 위치에 있는 메모리를 얼마만큼의 크기로 사용하겠다는 뜻이다.
// int level = 10; -> 4바이트 정수형 메모리가 level 이라는 이름으로 할당 되었다는 뜻이다.

// 기본 자료형(primitive data type)
// │        │ 정수형 │ 문자형 │ 실수형 │ 논리형 │
// │ 1바이트 │ byte  │       │       │boolean│
// │ 2바이트 │ short │ char  │       │       │
// │ 4바이트 │ int   │       │ float │       │
// │ 8바이트 │ long  │       │ double│       │

// 정수 자료형의 종류와 크기
// 비트의 맨앞은 부호비트로 사용
// │ 자료형 │ 크기 │   수의 범위   │
// │ byte  │  1  │ -2^7~2^7-1   │
// │ short │  2  │ -2^15~2^15-1 │
// │ int   │  3  │ -2^31~2^31-1 │
// │ long  │  4  │ -2^63~2^63-1 │

// byte : 1바이트 단위의 자료형 동영상, 음악파일, 실행파일의 자료를 처리할 때 사용.
// short : 2바이트 단위의 자료형 C / C++ 언어와 호환 시 사용.
// int : 자바에서 사용하는 정수에 대한 기본 자료형, 4바이트이며 프로그램에서 사용하는 모든 숫자(리터럴)은 int로 저장된다. 32비트를 초과하는 숫자는 long 자료형으로 처리.
// long : 8바이트 자료형, 숫자의 뒤에 알파벳 L 또는 l을 써서 long 형임을 표시.

public class IntVariableTest {
    public static void main(String[] args) {
        // byte의 범위는 -128~127 이다.
        byte bs = 127;
        System.out.println(bs);

//        int iVal = 12345678900; -> int의 표현범위를 넘어섬
        long iVal = 12345678900L;
        System.out.println(iVal);
    }
}
