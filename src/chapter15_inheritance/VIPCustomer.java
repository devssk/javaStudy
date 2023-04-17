package chapter15_inheritance;

public class VIPCustomer extends Customer{
    private int agentId;
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        salesRatio = 0.05;
        bonusRatio = 0.1;
    }

    public int getAgentId() {
        return agentId;
    }
}
