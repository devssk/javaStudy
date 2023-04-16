package chapter04_operator;

import java.util.Scanner;

// 조건 연산자
// 삼항 연산자
// 조건식의 결과가 ture인 경우와 false인 경우에 따라 다른 결과가 수행됨
// if문을 간단히 표현할 때 사용 할 수 있음
// 조건식 ? 결과1 : 결과2 -> 조건식의 결과가 참이면 결과1, 거짓이면 결과2가 반환
// int num = (5 > 3) ? 10 : 20;
public class ConditionTest {
    public static void main(String[] args) {
        int max;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input1");
        int x = scanner.nextInt();
        System.out.println("input2");
        int y = scanner.nextInt();

        max = (x > y) ? x : y;
        System.out.println("max = " + max);

    }
}
