package chapter25_interface3;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("seller order");
    }
}
