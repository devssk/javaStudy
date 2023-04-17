package chapter14_array;

// 다차원 배열
// 이차원 이상으로 구현 된 배열
// 평면 (이차원 배열) 이나 공간(삼차원 배열)을 활용한 프로그램 구현
public class TwoDimensionTest {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3];
        int[][] arr = {{1, 2, 3}, {4, 5, 6, 7}};

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
