package Exercise05.Chapter05;

import java.util.ArrayList;
import java.util.Arrays;

public class Chapter05 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = a;
        a.add(4);
        System.out.println(b.size());
    }
}

// a 리스트에 1,2,3을 추가한다.
// b 리스트에 a 리스트 내용을 넣는다.
// a 리스트에 4를 추가한다.
// b 리스트의 사이즈는 4
// 이유는 b 리스트는 새로운 객체로 생성한게 아니라서 a와 동일한 객체이기 때문이다.