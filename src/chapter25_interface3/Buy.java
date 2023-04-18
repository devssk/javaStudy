package chapter25_interface3;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("buyer order");
    }
}
