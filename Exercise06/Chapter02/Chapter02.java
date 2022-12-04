package Exercise06.Chapter02;

import java.io.IOException;
import java.util.Scanner;

public class Chapter02 {
    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            System.out.println(a.toUpperCase());

            if(a.equals("END"))
                break;
        }
    }
}
