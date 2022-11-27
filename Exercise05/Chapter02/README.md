[위키독스, 점프 투 자바 참고](https://wikidocs.net/157998)

Q2

객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자. 즉 다음과 같이 동작해야 한다.

```java
MaxLimitCalculator cal = new MaxLimitCalculator();
cal.add(50);  // 50 더하기
cal.add(60);  // 60 더하기
System.out.println(cal.getValue());  // 100 출력
```

단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator 클래스를 상속해서 만들어야 한다.

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

> ※ 메서드 오버라이딩을 사용해 보자.