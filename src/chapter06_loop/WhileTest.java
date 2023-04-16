package chapter06_loop;

import java.util.Scanner;

// while
// 조건이 ture(참)인 동안 반복수행
// 주어진 조건이 ture인 동안 지정된 수행문을 반복적으로 수행하는 제어문
// 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
// 조건은 주로 반복 횟수나 값의 비교 결과에 따라 ture, false 판단

// do-while
// 조건과 상관 없이 한번은 수행문을 수행
// while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관 없이 수행을 한 번 하고나서 조건을 체크
public class WhileTest {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("num = " + num);

        // do-while
        // 입력받는 모든 숫자의 합을 구하는 예제, 입력이 0이 되면 반복을 그만하고 합을 출력
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum2 = 0;

        do {
            input = scanner.nextInt();
            sum2 += input;

        } while(input != 0);


        System.out.println(sum2);


    }
}
