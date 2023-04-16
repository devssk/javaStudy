package chapter4_operator;

// 관계 연산자
// 이항 연산자
// 연산의 결과자 true(참), false(거짓)으로 반환 됨, 비교 연산자 라고도 함
// 조건문, 반복문의 조건식으로 많이 사용됨
// │ 연산자 │                         기능                        │   예   │
// │   >   │ 왼쪽 항이 크면 참, 아니면 거짓을 반환                    │ num > 3; │
// │   <   │ 왼쪽 항이 작으면 참, 아니면 거짓을 반환                  │ num < 3; │
// │  >=   │ 왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환 │ num >= 3; │
// │  <=   │ 왼쪽 항이 오른쪽 항보다 작거나 같으면 참, 아니면 거짓을 반환 │ num <= 3; │
// │  ==   │ 두 항이의 값이 같으면 참, 아니면 거짓을 반환              │ num == 3; │
// │  !=   │ 두 항의 값이 다르면 참, 아니면 거짓을 반환                │ num != 3; │
public class RelationalTest {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        boolean value = (num1 > num2);
        System.out.println("value = " + value);

        // false
        System.out.println(num1 < num2);
        // ture
        System.out.println(num1 >= num2);
        // false
        System.out.println(num1 <= num2);
        // false
        System.out.println(num1 == num2);
        // ture
        System.out.println(num1 != num2);
    }
}
