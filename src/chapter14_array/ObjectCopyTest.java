package chapter14_array;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("개미1", "베르나르 베르베르");
        library[1] = new Book("개미2", "베르나르 베르베르");
        library[2] = new Book("개미3", "베르나르 베르베르");
        library[3] = new Book("개미4", "베르나르 베르베르");
        library[4] = new Book("개미5", "베르나르 베르베르");

        Book[] copyLibrary = new Book[5];
        // System.arrayCopy(src, srcPos, dest, destPos, length) 자바에서 제공되는 배열 복사 메서드
        // 얕은 복사
        // 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨
        // 즉, 두 배열이 같은 객체를 가리킴
        // (복사할대상, 몇번째부터, 복사할 곳, 몇번째부터, 몇개를?)
        System.arraycopy(library, 0, copyLibrary, 0, 5);

        for (Book book : library) {
            System.out.println(book);
        }
        System.out.println("===================");
        for (Book book : copyLibrary) {
            System.out.println(book);
        }
    }
}
