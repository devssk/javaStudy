package chapter5_if;

// 조건문
// 주어진 조건에 따라 다른 실행이 이루어 지도록 구현
// if else if else
// 하나의 상황에 대한 조건이 여러개로 나뉘고 각 조건에 다른 수행이 이루어져야 할 경우 사용
// 각 조건은 상호 배타적. 즉, 하나의 조건식이 만족하면 다른 조건식은 비교하지 않음
// if else if 를 사용하는 경우 하나의 조건이 만족 되면 나머지 else if 부분은 수행 되지 않음
// if - if 로 사용하게 되면 각각 다른 조건 문으로 각각 수행하게 됨
public class IfElseTest {
    public static void main(String[] args) {
        int age = 7;

        //Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

        int age2 = 12;
        int charge;

        if (age2 < 8) {
            charge = 1000;
            System.out.println("미 취학 아동입니다.");
        } else if (age2 < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        } else if (age2 < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        } else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "원입니다.");

        int age3 = 12;
        int charge2;

        if (age3 < 8) {
            charge2 = 1000;
            System.out.println("미 취학 아동입니다.");
        }
        if (age3 < 14) {
            charge2 = 2000;
            System.out.println("초등학생 입니다.");
        }
        if (age3 < 20) {
            charge2 = 2500;
            System.out.println("중, 고등학생 입니다.");
        } else {
            charge2 = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge2 + "원입니다.");


    }
}
