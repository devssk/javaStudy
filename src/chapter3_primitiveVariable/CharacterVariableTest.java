package chapter3_primitiveVariable;

// 문자도 정수로 표현
// 문자를 컴퓨터 내부에서 표현하기 위해 특정 정수 값을 정의
// 문자세트 (character set) : ASKII, euc-kr, utf-8, utf-16 등
// 자바는 문자를 나타내기 위해 전세계 표준 UNICODE를 사용
// 유니코드의 1바이트는 ASKII를 사용
// utf-16 인코딩을 사용 (모든 문자를 2바이트로 표시)
// 문자를 위한 데이터 타입 char
// 내부적으로 숫자로 표현되므로 숫자를 넣어도 문자가 출력, 음수는 사용할수 없음
// ''는 문자를 표현, ""는 문자열을 표현
// char ch = 'A'; 와 char ch2 = 65; 는 같다.
public class CharacterVariableTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println("ch1 = " + ch1);
        System.out.println("(int)ch1 = " + (int)ch1);

        char ch2 = 66;
        System.out.println("ch2 = " + ch2);

        char ch3 = '한';
        // 앞에 역슬래시u를 사용하면 유니코드를 나타낸다.
        char ch4 = '\uD55C';

        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);

    }
}
