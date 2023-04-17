package chapter17_inheritance_overriding;

// 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할 수 없음
// 외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용
public class Customer {
    protected int customerId;
    protected String customerName;
    protected String customerGrade;

    int bonusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade +
                "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
    }
}
