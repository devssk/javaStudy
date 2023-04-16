package chapter6_loop;

// 중첩 반복문
// 반복문 내부에 또 다른 반복문이 있음
// 여러 겹으로 반복문을 겹쳐서 구현 가능(수행시간에 문제가 발생할 수 있다)
// 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의 하며 구현
public class NestedLoopTest {
    public static void main(String[] args) {
        int dan = 2;
        int count = 1;
        for (dan = 2; dan <= 9; dan++) {
            System.out.println(dan + "단");
            for (count = 1; count <= 9; count++) {
                System.out.println(dan + "X" + count + " = " + dan * count);
            }
            System.out.println();
        }
    }
}
