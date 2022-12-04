package Exercise06.Chapter01;

import java.io.IOException;
import java.util.Scanner;

class Cal {
    int Num (int a, int b) {
        return a + b;
    }
}

public class Chapter01 {
    public static void main (String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        Cal cal = new Cal();

        System.out.println(cal.Num(sc.nextInt(), sc.nextInt()));
    }
}
