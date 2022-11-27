[위키독스, 점프 투 자바 참고](https://wikidocs.net/157998)

Q6

다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다. 하지만 코드를 실행하면 오류가 발생한다. Calculator 클래스를 수정하여 다음의 코드에서 오류가 발생하지 않도록 하시오.

```java
class Calculator {
    Integer value;
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}

public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
```
