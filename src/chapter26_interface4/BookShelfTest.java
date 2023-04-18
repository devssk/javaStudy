package chapter26_interface4;

// 클래스 상속과 인터페이스 구현 함께 쓰기
// 실무에서 프레임워크나 오픈소스와 함께 연동되는 구현을 하게 되면 클래스 상속과 인터페이스의 구현을 같이 사용하는 경우가 많음
// 책이 순서대로 대여가 되는 도서관 구현
// 책을 보관하는 자료 구조가 Shelf에 구현됨 (ArrayList)
// Queue 인터페이스를 구현함
// Shelf 클래스를 상속 받고 Queue를 구현한다.
public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("개미1");
        bookQueue.enQueue("개미2");
        bookQueue.enQueue("개미3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
