package chapter21_abstractClass_templateMethod;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void fuel();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void engineOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}

    // 템플릿 메서드
    final public void run() {
        startCar();
        drive();
        stop();
        engineOff();
        fuel();
        washCar();
    }
}
