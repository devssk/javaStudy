package chapter25_interface3;

// 여러 인터페이스 구현
// 자바의 인터페이스는 구현 코드가 없으므로 하나의 클래스가 여러 인터페이스는 구현 할 수 있음
// 디폴트 메서드가 중복 되는 경우는 구현 하는 클래스에서 재정의 하여야 함
// 여러 인터페이스를 구현한 클래스는 인터페이스 타입으로 형 변환 되는 경우 해당 인터페이스에 선언된 메서드만 사용 가능 함

// 디폴트 메서드가 중복 되는 경우
// 구현 코드를 가지고 인스턴스 생성된 경우만 호출되는 디폴트 메서드의 경우 두 개의 인터페이스에서 중복되면 구현하는 클래스에서 반드시 재정의를 해야 함

// 인터페이스 상속
// 인터페이스 사이에도 상속을 사용할 수 있음
// extends 키워드를 사용
// 인터페이스는 다중 상속이 가능하고 구현 코드의 상속이 아니므로 타입 상속 이라고 함
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sell();
        customer.buy();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();
    }
}
