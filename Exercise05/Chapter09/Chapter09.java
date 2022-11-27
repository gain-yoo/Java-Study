package Exercise05.Chapter09;

interface Predator {
    String bark();
}

abstract class Animal {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    public String bark() {
        return "Bark bark!!";
    }
}

public class Chapter09 {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

        System.out.println(a.hello());  // 1번
        //System.out.println(a.bark());   // 2번 오류발생
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        //System.out.println(c.hello());  // 5번 오류발생
        System.out.println(c.bark());   // 6번
    }
}

// 1번 Animal 클래스 사용 가능
// 2번 Lion 객체를 Animal 자료형으로 사용할 경우에는 Lion 클래스에만 존재하는 bark 메소드를 사용할 수 없고 hello 메소드만 사용 가능하다. 
// 3번 Lion 및 Animal 클래스 사용 가능
// 4번 Lion 클래스 사용 가능
// 5번 Predator 타입의 객체는 bark 메소드만 사용 가능하다
// 6번 bark 메소드 사용 가능