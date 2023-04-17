package chapter14_array;

import java.util.ArrayList;

// ArrayList
// 기존의 배열 선언과 사용 방식은 배열의 길이를 정하고(크기 고정) 요소의 개수가 배열의 길이보다 커지면 배열을 재할당하고 복사해야 했음
// 배열의 요소를 추가하거나 삭제하면 다른 요소들의 이동에 대한 구현을 해야 함
// ArrayList는 객체 배열을 좀더 효율적으로 관리하기 위해 자바에서 제공해 주는 클래스
// 이미 많은 메서드들이 최적의 알고리즘으로 구현되어 있어 각 메서드의 사용 방법만 익히면 유용하게 사용할 수 있음
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("개미1", "베르나르 베르베르"));
        list.add(new Book("개미2", "베르나르 베르베르"));
        list.add(new Book("개미3", "베르나르 베르베르"));
        list.add(new Book("개미4", "베르나르 베르베르"));
        list.add(new Book("개미5", "베르나르 베르베르"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).showBookInfo();
        }
    }
}
