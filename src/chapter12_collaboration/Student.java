package chapter12_collaboration;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        if (this.money < 1000) {
            System.out.println("남은돈 : " + this.money + " 돈이 부족합니다.");
        } else {
            bus.take(1000);
            this.money -= 1000;
        }
    }

    public void takeSubway(Subway subway) {
        if (this.money < 1000) {
            System.out.println("남은돈 : " + this.money + " 돈이 부족합니다.");
        } else {
            subway.take(1200);
            this.money -= 1200;
        }
    }

    public void showStudentInfo() {
        System.out.println(studentName + "의 남은 돈은 " + money + "원 입니다.");
    }

}
