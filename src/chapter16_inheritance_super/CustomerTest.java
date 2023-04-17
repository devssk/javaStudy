package chapter16_inheritance_super;

// 하위 클래스가 생성 되는 과정
// 하위 클래스를 생성하면 상위 클래스가 먼저 생성 됨
// new VIPCustomer()를 호출하면 Customer()가 먼저 호출 됨
// 클래스가 상속 받은 경우 하위 클래스의 생성자에서는 반드시 상위 클래스의 생성자를 호출 함
public class CustomerTest {
    public static void main(String[] args) {

//        Customer customerLee = new Customer();
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(1);
//        customerLee.bonusPoint = 1000;
//
//        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(2, "김유신");
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());
    }
}
