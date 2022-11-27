package Exercise05.Chapter04;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int avg(int[] data) {
        int sum = 0;
        int avg = 0;
        for (int i=0; i<data.length; i++)
            sum += data[i];
        avg = sum / data.length;
        
        return avg;

    }

    int avg(ArrayList<Integer> data) {
        int sum = 0;
        int avg = 0;
        for (int i=0; i<data.size(); i++)
            sum += data.get(i);
        avg = sum / data.size();
        
        return avg;

    }

    int getValue() {
        return this.value;
    }
}

public class Chapter04 {
    public static void main (String[] args) {
        Calculator cal = new Calculator();

        int[] data = {1, 3, 5, 7, 9, 11};
        int result = cal.avg(data);
        System.out.println(result);

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13));
        int result2 = cal.avg(data2);
        System.out.println(result2);  // 5 출력
    }
    
}
