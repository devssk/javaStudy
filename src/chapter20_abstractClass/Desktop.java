package chapter20_abstractClass;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크탑 화면");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 타자");
    }

    @Override
    public void turnOff() {
        System.out.println("데스크탑 전원을 끕니다.");
    }
}
