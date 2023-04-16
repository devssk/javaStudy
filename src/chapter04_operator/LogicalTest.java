package chapter04_operator;

// 논리 연산자
// 관계 연산자와 혼합하여 많이 사용
// 연산의 결과가 true(참), false(거짓)으로 반환
// │ 연산자 │                         기능                          │          예          │
// │  &&   │ 두 항이 모두 참인 경우에만 ture, 그렇지 않으면 false        │ (5 > 3) && (5 > 2); │
// │  ||   │ 두 항 중 하나만 참이어도  ture, 두 항이 모두 거짓이면 false │  (5 > 3) || (5 < 2)  │
// │  !    │ 단항 연산자. 참인 경우 거짓으로 바꾸고 거짓인 경우 참으로 바꿈 │       !(5 > 3)       │

// 단락 회로 평가(short circuit evaluation)
// && 은 두 항의 결과가 모두 true 일 때 결과가 true이지만 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음(계산하지 않음)
// || 은 두 항의 결과가 모두 false 일 때만 결과가 false이지만 앞의 항의 결과가 ture이면 뒤 항의 결과를 평가하지 않음(계산하지 않음)
public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);
        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag);
        flag = (num1 > 0) || (num2 > 0);
        System.out.println(flag);
        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag);
        flag = !(num1 > 0);
        System.out.println(flag);

        int num3 = 10;
        int i = 2;

        boolean value = ((num3 = num3 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num3);
        System.out.println(i);

        value = ((num3 = num3 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
        System.out.println(value);
        System.out.println(num3);
        System.out.println(i);

    }
}
