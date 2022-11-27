package Exercise05.Chapter03;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    boolean isOdd() {
        return this.value % 2 == 1;
    }

    int getValue() {
        return this.value;
    }


}

public class Chapter03 {
    public static void main (String[] args){
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());
        if (cal.getValue() > 0)
            System.out.println(cal.isOdd());

    }
}
