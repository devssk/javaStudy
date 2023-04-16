package chapter13_static;

// static 변수
// 공통으로 사용하는 변수가 필요한 경우
// 여러 인스턴스가 공유하는 기준 값이 필요한 경우
// 학생마다 새로운 학번 생성
// 카드회사에서 카드를 새로 발급할때마다 새로운 카드 번호를 부여
// 회사에 사원이 입사할때 마다 새로운 사번이 필요한 경우
// 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당(데이터 영역 메모리)
// 클래스 변수, 정적변수라고도 함(vs. 인스턴스 변수)
// 인스턴스 생성과 상관 없이 사용 가능하므로 클래스 이름으로 직접 참조
// static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
// 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음

// 변수의 유효 범위와 메모리
// 변수의 유효 범위(scope)와 생성과 소멸(life cycle)은 각 변수의 종류마다 다름
// 지역변수, 멤버 변수, 클래스 변수는 유효범위와 life cycle, 사용하는 메모리도 다름
// │  변수 유형  │               선언 위치                 │                                사용 범위                                 │   메모리   │                                           생성과 소멸                                           │
// │  지역 변수  │ 함수 내부에 선언                         │ 함수 내부에서만 사용                                                       │ stack     │ 함수가 호출될 때 생성되고 함수가 끝나면 소멸함                                                       │
// │  멤버 변수  │ 클래스 멤버 변수로 선언                   │ 클래스 내부에서 사용하고 private가 아니면 참조 변수로 다른 클래스에서 사용 가능     │ heap      │ 인스턴스가 생성될 때 힙에 생성되고 GC가 메모리를 수거할 때 소멸                                        │
// │ static 변수 │ static 예약어를 사용하여 클래스 내부에 선언 │ 클래스 내부에서 사용하고 private가 아니면 클래스 이름으로 다른 클래스에서 사용 가능 │ data area │ 프로그램이 처음 시작할 때 상수(final)와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해체할 때 소멸 │

// static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
// 클래스 내부의 여러 메서드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
// 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됨
// 상황에 적절하게 변수를 사용해야 함
public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        employeeId = serialNum++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }
}
