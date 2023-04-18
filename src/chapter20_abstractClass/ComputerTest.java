package chapter20_abstractClass;


// 추상클래스 (abstract class)
// 구현 코드 없이 메서드의 선언만 있는 추상 메서드(abstract method)를 포함한 클래스
// 메서드 선언(declaration) : 반환타입, 메서드 이름, 매개변수로 구성
// 메서드 정의(definition) : 메서드 구현(implementation)과 동일한 의미 구현부(body) 를 가짐 ({ })
// 예) int add(int x, int y); // 선언
// int add(int x, int y){ } // 구현부가 있음, 추상 메서드 아님
// abstract 예약어를 사용
// 추상 클래스는 new 할 수 없음 ( 인스턴스화 할 수 없음 )

// 구현하기
// 메서드에 구현 코드가 없으면 abstract 로 선언
// abstract로 선언된 메서드를 가진 클래스는 abstract로 선언
// 모든 메서드가 구현 된 클래스라도 abstract로 선언되면 추상 클래스로 인스턴스화 할 수 없음
// 추상 클래스의 추상 메서드는 하위 클래스가 상속 하여 구현
// 추상 클래스 내의 추상 메서드 : 하위 클래스가 구현해야 하는 메서드
// 추상 클래스 내의 구현 된 메서드 : 하위 클래스가 공통으로 사용하는 메서드 ( 필요에 따라 하위 클래스에서 재정의 함 )
public class ComputerTest {
    public static void main(String[] args) {
        Computer deskTop = new Desktop();
        deskTop.display();
        deskTop.turnOff();
        NoteBook myNoteBook = new MyNoteBook();
        myNoteBook.display();
        myNoteBook.typing();
    }
}
