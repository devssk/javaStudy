package chapter19_polymorphism;

import java.util.ArrayList;

// 다형성 (polymorphism)
// 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
// 같은 코드에서 여러 다른 실행 결과가 나옴
// 정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나임
// 다형성을 잘 활용하면 유연하고 확장성있고, 유지보수가 편리한 프로그램을 만들수 있음

// 다형성을 사용하는 이유?
// 다른 동물을 추가하는 경우
// 상속과 메서드 재정의를 활용하여 확장성 있는 프로그램을 만들 수 있음
// 그렇지 않는 경우 많은 if-else if문이 구현되고 코드의 유지보수가 어려워짐
// 상위 클래스에서는 공통적인 부분을 제공하고 하위 클래스에서는 각 클래스에 맞는 기능 구현
// 여러 클래스를 하나의 타입(상위 클래스)으로 핸들링 할 수 있음
public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for (Animal animal : animalList) {
            // 다형성
            // 각 인스턴스가 무엇이냐에 따라 각 인스턴스의 move()가 호출
            animal.move();
        }
        animalMove(hAnimal);
        animalMove(tAnimal);
        animalMove(eAnimal);

        testDownCasting(animalList);
    }

    public static void animalMove(Animal animal) {
        animal.move();
    }

    // 다운캐스팅과 instanceof
    // 업캐스팅된 클래스를 다시 원래의 타입으로 형 변환
    // 하위 클래스로의 형 변환은 명시적으로 해야 함
    // instanceof를 이용하여 인스턴스의 형 체크
    // 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드 맞으면 true 아니면 false를 반환 함
    public static void testDownCasting(ArrayList<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            }
            if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
            if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            }
        }
    }
}

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아갑니다.");
    }
    public void flying() {
        System.out.println("독수리가 날개를 펴고 날아갑니다.");
    }
}
