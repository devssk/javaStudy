package chapter14_array;

// 기본 자료형 배열은 선언과 동시에 배열의 크기만큼의 메모리가 할당되지만,
// 객체 배열의 경우엔 요소가 되는 객체의 주소가 들어갈(4바이트, 8바이트) 메모리만 할당되고(null) 각 요소 객체는 생성하여 저장해야 함
public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("개미1", "베르나르 베르베르");
        library[1] = new Book("개미2", "베르나르 베르베르");
        library[2] = new Book("개미3", "베르나르 베르베르");
        library[3] = new Book("개미4", "베르나르 베르베르");
        library[4] = new Book("개미5", "베르나르 베르베르");

        for (Book book : library) {
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
