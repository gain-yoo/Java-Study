package Exercise05.Chapter02;

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

class MaxLimitCalculator extends Calculator {
    int getValue() {
        if (this.value > 100) {
            this.value = 100;
        }
        return this.value;
    }
}

public class Chapter02 {
    public static void main(String[] args){
        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
    }
}
