package chapter06_loop;

// for
// for (초기화식; 조건식; 증감식) { 수행문; }
// 각 식은 생략 가능
// 초기화식 생략 : 이미 이전에 값이 초기화 되어 for 내부에서 값을 지정할 필요가 없는 경우
// 조건식 생략 : 반복 수행에 대한 조건이 수행문 내부에 있는 경우
// 증감식 생략 : 증감식에 대한 연산이 복잡하거나 다른 변수의 연산 결과값에 결정되는 경우
public class ForTest {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < 10; i++, count++) {
            sum += count;
            // count++ -> 증감식에 써도 됨
        }
        int sum2 = 0;
        for (int i = 1; i < 11; i++) {
            sum2 += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("sum2 = " + sum2);
    }
}
