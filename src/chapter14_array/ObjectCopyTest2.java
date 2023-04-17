package chapter14_array;

public class ObjectCopyTest2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("개미1", "베르나르 베르베르");
        library[1] = new Book("개미2", "베르나르 베르베르");
        library[2] = new Book("개미3", "베르나르 베르베르");
        library[3] = new Book("개미4", "베르나르 베르베르");
        library[4] = new Book("개미5", "베르나르 베르베르");

        Book[] copyLibrary = new Book[5];

        // 깊은 복사
        // 각각의 객체를 생성하여 그 객체의 값을 복사하여 배열이 서로 다른 객체를 가리키도록 함
        for (int i = 0; i < copyLibrary.length; i++) {
            copyLibrary[i] = new Book();
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }

        for (Book book : library) {
            System.out.println(book);
        }
        System.out.println("===================");
        for (Book book : copyLibrary) {
            System.out.println(book);
        }
    }
}
