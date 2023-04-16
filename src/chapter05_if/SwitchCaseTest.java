package chapter05_if;

// switch-case
// if else if else 를 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
// 비교 조건이 특정 값이나 문자열인 경우 사용
// break 를 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
// 자바 14부터 좀 더 간결해진 표현식이 지원
// 간단하게 ,로 조건 구분
// 식으로 표현하여 반환 값을 받을 수 있음, 리턴 값이 없는 경우는 오류가 발생
// yield 키워드 사용
public class SwitchCaseTest {
    public static void main(String[] args) {
        // case 가 숫자
        int month = 10;
        int day;

        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                day = 0;
                System.out.println("존재하지 않는 달 입니다.");

        }
        System.out.println(month + "월은 " + day + "일입니다.");

        // case가 문자열
        String medal = "Gold";

        switch(medal) {
            case "Gold":
                System.out.println("금메달 입니다.");
                break;
            case "Silver":
                System.out.println("은메달 입니다.");
                break;
            case "Bronze":
                System.out.println("동메달 입니다.");
                break;
            default:
                System.out.println("메달이 없습니다.");
                break;
        }

        // 자바 14부터 지원
        int month2 = 3;

        int day2 = switch(month2) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("한 달은 31일입니다.");
                yield 31;
            }
            case 4, 6, 9, 11 -> {
                System.out.println("한 달은 30일입니다.");
                yield 30;
            }
            case 2 -> {
                System.out.println("한 달은 28일입니다.");
                yield 28;
            }
            default -> {
                System.out.println("존재하지 않는 달 입니다.");
                yield 0;
            }
        };
        System.out.println(month2 + "월은 " + day2 + "일입니다.");


    }
}
