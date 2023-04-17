package chapter17_inheritance_overriding;

public class CustomerTest {
    public static void main(String[] args) {

        int price = 10000;

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(1);
        customerLee.bonusPoint = 1000;
        int cost = customerLee.calcPrice(price);
        System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + cost + "입니다.");

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(2);
        customerKim.bonusPoint = 10000;
        int cost2 = customerKim.calcPrice(price);
        System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + cost2 + "입니다.");

        // customerPark 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 이다
        // 자바에서는 항상 인스턴스의 메서드가 호출 된다 (가상메서드의 원리)
        // 자바의 모든 메서드는 가상 메서드(virtual method) 이다
        Customer customerPark = new VIPCustomer();
        customerPark.setCustomerName("park");
        int cost3 = customerPark.calcPrice(price);
        System.out.println(customerPark.showCustomerInfo() + " 지불 금액은 " + cost3 + "입니다.");
    }
}
