package chapter04_operator;

// 비트 연산자
// 대입 연산자와 다른 연산자가 함께 쓰임
// 마스크 :  특정 비트를 가리고 몇 개의 비트 값만 사용할 때
// 비트켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때
// & 00001111 (하위 4비트 중 1인 비트만 꺼내기)
// 비트 끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때
// | 11110000 (하위 4비트 중 0인 비트만 0으로 만들기)
// 비트 토글 : 모든 비트들을 0은 1, 1은 0으로 바꾸고 싶을 때
// │  연산자  │         기능        │                  예                       │
// │    ~    │ 비트의 반전(1의 보수) │ a = ~a;                                   │
// │    &    │ 비트 단위 AND       │ 1 & 1 1반환 그 외는 0                       │
// │    |    │ 비트 단위 OR        │ 0 | 0 0반환 그 외는 1                       │
// │    ^    │ 비트 단위 XOR       │ 두 개으 ㅣ비트가 서로 다른 경우에 1을 반환       │
// │    <<   │ 왼쪽 shift         │ a << 2 변수 a를 2비트 만큼 왼쪽으로 이동        │
// │    >>   │ 오른쪽 shift        │ a >> 2 변수 a를 2비트 만큼 오른쪽으로 이동      │
// │   >>>   │ 오른쪽 shift        │ >> 동일 연산, 채워지는 비트가 부호와 상관 없이 0 │
public class BitTest {
    public static void main(String[] args) {
        int num1 = 5;  	// 00000101
        int num2 = 10; 	// 00001010

        System.out.println(num1 | num2);
        System.out.println(num1 & num2);
        System.out.println(num1 ^ num2);
        System.out.println(~num1);

        System.out.println(num1 << 2);
        System.out.println(num1);
        System.out.println(num1 <<= 2);
        System.out.println(num1);

    }
}
