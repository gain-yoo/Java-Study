[위키독스, 점프 투 자바 참고](https://wikidocs.net/157998)

Q1

다음은 Calculator 클래스와 그 사용법을 담은 코드이다.

```java
class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}
```

```java
public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력
    }
}
```

Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자. 즉 다음과 같이 동작하는 클래스를 만들어야 한다.

```java
UpgradeCalculator cal = new UpgradeCalculator();
cal.add(10);
cal.minus(3);
System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력
```