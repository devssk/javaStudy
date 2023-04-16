package chapter4_operator;

// 항과 연산자
// 항(operand) : 연산에 사용되는 값
// 연산자(operator) : 항을 이용하여 연산하는 기호
// │   연산자   │       설명        │        예        │
// │ 단항 연산자 │ 항이 한 개인 연산자 │      ++num       │
// │ 이항 연산자 │ 항이 두 개인 연산자 │   num1 + num2;   │
// │ 삼항 연산자 │ 항이 세 개인 연산자 │ (5 > 3) ? 1 : 0; │
// 우선순위는 단항 > 이항 > 삼항

// 대입 연산자 (assignment operator)
// 변수에 다른 변수나 값을 대입하는 연산자
// 이항 연산자 중 우선 순위가 가장 낮은 연산자들
// 왼쪽 변수 = 오른쪽 변수(또는 식, 값)

// 부호 연산자
// 단항 연산자이며 변수의 부호를 유지하거나(+) 바꿈(-)
// 실제 변수의 부호가 변하려면 대입 연산자를 사용해야 함

// 산술 연산자
// 사칙연산
// │ 연산자 │                        기능                      │   예   │
// │   +   │ 두 항을 더합니다.                                  │ 5 + 3 │
// │   -   │ 앞에 있는 항에서 뒤에 있는 항을 뺍니다                │ 5 - 3 │
// │   *   │ 두 항을 곱합니다.                                  │ 5 * 3 │
// │   /   │ 앞에 있는 항에서 뒤에 있는 항을 나누어 몫을 구합니다    │ 5 / 3 │
// │   %   │ 앞에 있는 항에서 뒤에 있는 항을 나누어 나머지를 구합니다 │ 5 % 3 │

// 복합 대입 연산자
// 대입 연산자와 다른 연산자가 함께 쓰인다
// +=, -=, *=, /=, %= 등

// 증가, 감소 연산자
// 단항 연산자
// 변수의 값을 1더하거나 1뺄때 사용
// 연산자의 위치에 따라 연산 시점의 결과가 달라짐
// 문장의 끝(;)을 기준으로 연산 시점을 생각해야 함
// ++, 항의 값에 1을 더한다
// ++num; : 먼저 num값이 1 증가한 후 변수에 대입
// num++; : 기존 num값을 먼저 대입한 후에 num 값이 1 증가
// --, 항의 값에 1을 뺀다
// --num; : 먼저 num값이 1 감소한 후 변수에 대입
// num--; : 기존 num값을 먼저 대입한 후에 num 값이 1 감소
public class OperatorTest {
    public static void main(String[] args) {
        int total = 10;
        int add = 20;

        total += add;
        System.out.println("total = " + total);

        int gameScore = 100;
        int myScore;

        myScore = ++gameScore;
        System.out.println("myScore = " + myScore + "," + "gameScore = " + gameScore);
        myScore = gameScore++;
        System.out.println("myScore = " + myScore + "," + "gameScore = " + gameScore);
    }
}
