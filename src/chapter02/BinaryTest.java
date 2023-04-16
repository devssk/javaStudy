package chapter02;

public class BinaryTest {
    public static void main(String[] args) {
        // 10진수
        int num = 10;
        // 2진수, 2진수값 앞에 0B(0b)를 붙이면 2진수를 나타낸다.
        int bNum = 0B1010;
        // 8진수, 8진수값 앞에 0을 붙이면 8진수를 나타낸다.
        int oNum = 012;
        // 16진수, 16진수값 앞에 0X(0x)를 붙이면 16진수를 나타낸다.
        int xNum = 0XA;

        System.out.println("num = " + num);
        System.out.println("bNum = " + bNum);
        System.out.println("oNum = " + oNum);
        System.out.println("xNum = " + xNum);

        // 문자 표현
        int cNum = 0b01000001;
        System.out.println("cNum = " + (char)cNum);
    }
}
