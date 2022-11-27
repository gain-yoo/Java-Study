package Exercise05.Chapter08;

interface Predator {
}

class Animal {
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
}

public class Chapter08 {
    public static void main(String[] args) {
        Animal a = new Animal();  // 1번 
        Animal b = new Dog();  // 2번
        Animal c = new Lion();  // 3번
        //Dog d = new Animal();  // 4번
        Predator e = new Lion();  // 5번
    }
}

// 1번 IS-A 관계 성립 (Animal is an Animal)
// 2번 IS-A 관계 성립 (Dog is an Animal)
// 3번 IS-A 관계 성립 (Lion is an Animal)
// 4번 부모 클래스로 만든 객체는 자식 클래스의 자료형으로 사용할 수 없다.
// 5번 IS-A 관계 성립 (Lion is a Predator)