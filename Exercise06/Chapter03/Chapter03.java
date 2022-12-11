package Exercise06.Chapter03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Chapter03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("./Exercise06/Chapter03/sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("./Exercise06/Chapter03/sample.txt"));
        String line = br.readLine();
        System.out.println(line); 
        br.close();  //생략해도 컴파일 오류없음
    }
}
