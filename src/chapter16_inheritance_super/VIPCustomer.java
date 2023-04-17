package chapter16_inheritance_super;

// super 키워드
// 하위 클래스에서 가지는 상위 클래스에 대한 참조 값
// super()는 상위 클래스의 기본 생성자를 호출 함
// 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출 됨
// (이때 반드시 상위 클래스의 기본 생성자가 존재 해야 함)
// 상위 클래스의 기본 생성자가 없는 경우 ( 다른 생성자가 있는 경우 ) 하위 클래스에서는 생성자에서는 super를 이용하여
// 명시적으로 상위 클래스의 생성자를 호출 함
// super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 이용하여 상위 클래스의 메서드나 멤버 변수에 접근할 수 있음
public class VIPCustomer extends Customer {
    private int agentId;
    double salesRatio;

//    public VIPCustomer() {
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
        System.out.println("VIPCustomer(int, String) call");
    }

    public int getAgentId() {
        return agentId;
    }
}
