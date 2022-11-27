[위키독스, 점프 투 자바 참고](https://wikidocs.net/157998)

Q5

다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.

```java
import java.util.ArrayList;
import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
}
```
