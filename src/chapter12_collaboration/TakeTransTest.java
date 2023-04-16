package chapter12_collaboration;

// 객체 간의 협력 (collaboration)
// 객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
// 협력을 위해서는 필요한 메세지를 전송하고 이를 처리하는 기능이 구현되어야 함
// 매개 변수로 객체가 전달되는 경우가 발생
public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("james", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showStudentInfo();
        studentT.showStudentInfo();
        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
    }
}
