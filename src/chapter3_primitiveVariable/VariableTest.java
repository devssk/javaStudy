package chapter3_primitiveVariable;

// 변수(Variable)는 변하는 수
// 프로그램에서 항상 변하는 값을 나타낼 필요가 있다.(학생의 성적, 은행잔고, 게임의 레벨 등등)
// 표현하려는 값이 숫자, 문자, 문자열등 다양할 수 있으므로 그에 맞는 자료형을 사용
// 변수를 선언한다는 것은 변수의 자료형을 선택하고 이름을 정하는것이다.
// 변수 선언은 자료형과 변수명으로 선언한다. 선언과 동시에 초기화 할 수 있다.
// 변수명은 영문자나 숫자를 사용할 수 있고, 특수문자는 $와 _만 사용
// 변수이름의 시작은 숫자로 할 수 없다.
// 자바에서 이미 사용하고 있는 예약어는 사용할 수 없다(while, if, break, continue 등)
public class VariableTest {
    public static void main(String[] args) {
        // 변수는 여러개를 한번에 선언할 수 있다.
        // int는 메모리에서 4bite를 할당
        int age, count;
        // age를 초기화
        age = 10;

        // 선언과 동시에 초기화가 가능하다.
        int level = 10000;
        System.out.println(age);
        System.out.println(level);
    }
}
