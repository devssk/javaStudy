package chapter14_array;

// 배열(array)
// 동일한 자료형의 순차적 자료 구조
// 인덱스 연산자[]를 이용하여 빠른 참조가 가능 -> 배열 요소가 저장된 메모리의 위치를 연산하여 찾아 줌
// 물리적 위치와 논리적 위치가 동일
// 배열의 순서는 0부터 시작
// 배열을 선언하면 개수만큼 메모리가 할당되지만, 실제 요소(데이타)가 없는 경우도 있음
// 배열의 length 속성은 배열의 개수를 반환해주기 때문에 요소의 개수와는 다름
// length를 활용하여 오류가 나는 경우 -> 요소의 개수에 대한 변수(count)를 따로 유지
// 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용함
public class ArrayTest {
    public static void main(String[] args) {
        // 배열 선언하기
        int[] arr1 = new int[10];
        int arr2[] = new int[10];

        // 배열 초기화 하기
        // 배열은 선언과 동시에 자료형에 따라 초기화 됨 (정수는 0, 실수는 0.0, 객체는 null)
        // 필요에 따라 초기값을 지정할 수 있음
        int[] numbers = {1, 2, 3, 4, 5};
//        int[] numbers = new int[] {1, 2, 3, 4, 5}; -> 개수 생략
//        int[] numbers;
//        numbers = new int[] {1, 2, 3, 4, 5}; -> 선언후 배열을 생성하는 경우 new int[] 생략 불가

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // for-each
        for (int number : numbers) {
            System.out.println(number);
        }

        int[] arr = new int[10];

        for (int i = 0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("total = " + total);

        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch++;
        }

        for (char alphabet : alphabets) {
            System.out.println("alphabet = " + alphabet);
        }

    }
}
