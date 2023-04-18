package chapter19_polymorphism;

// 메서드 재정의(overriding)
// 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우
// 하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
// VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
// 재정의 하여 구현해야 함
public class VIPCustomer extends Customer {
    private int agentId;
    double salesRatio;

//    public VIPCustomer() {
//        //super();
//        customerGrade = "VIP";
//        salesRatio = 0.1;
//        bonusRatio = 0.05;
//    }

    public VIPCustomer(int customerId, String customerName, int agendId) {
        super(customerId, customerName);
        customerGrade = "VIP";
        salesRatio = 0.1;
        bonusRatio = 0.05;
        this.agentId = agendId;

        System.out.println("VIPCustomer(int, String) call");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }

    public int getAgentId() {
        return agentId;
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 상담원 아이디는 " + agentId + "입니다.";
    }
}
