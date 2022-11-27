[위키독스, 점프 투 자바 참고](https://wikidocs.net/157998)

Q4

다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가해 보자.

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

정수 배열을 사용한 예는 다음과 같다.

```java
int[] data = {1, 3, 5, 7, 9};
Calculator cal = new Calculator();
int result = cal.avg(data);
System.out.println(result);  // 5 출력
```
정수 리스트를 사용한 예는 다음과 같다.

```java
ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
Calculator cal = new Calculator();
int result = cal.avg(data);
System.out.println(result);  // 5 출력
```

> ※ 메서드 오버로딩을 사용해 보자.