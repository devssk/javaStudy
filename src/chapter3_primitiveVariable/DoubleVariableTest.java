package chapter3_primitiveVariable;

// 실수는 부동소수점 방식으로 표현
//           [지수]
//  1.0 X 10^-1
// [가수] [밑수]
// 지수부와 가수부로 표현
// 컴퓨터에서는 밑수를 2로 사용
// 정규화 : 가수가 밑수보다 작은 한 자리까지 가수로 표현 되는 것
// 컴퓨터에서는 밑수가 2 이므로 정규화를 하게 되면 가수부분의 첫 번째 자리 숫자는 항상 1
// 0.2 -> 0.4 X 2^-1 정규화 -> 1.6 X 2^-3
// float : 32비트, 부호비트 1비트, 지수부 8비트, 가수부 23비트
// double : 64비트, 부호비트 1비트, 지수부 11비트, 가수부 53비트
public class DoubleVariableTest {
    public static void main(String[] args) {
        double dNum = 3.14;
//        float fNum = 3.14; -> 실수의 리터럴이 double이기 때문에 뒤에 F(f)를 붙여줘야한다. 타입이 맞지 않음
        float fNum = 3.14f;

        System.out.println("dNum = " + dNum);
        System.out.println("fNum = " + fNum);

        // 부동소수점 오류
        // 지수부가 0을 표현할 수 없기 때문에 오차가 발생함.
        double myNum = 1;
        for (int i = 0; i < 10000; i++) {
            myNum += 0.1;
        }
        // 1001.000000000159 이 출력된다.
        System.out.println("myNum = " + myNum);

    }
}
