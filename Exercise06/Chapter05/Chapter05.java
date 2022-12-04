package Exercise06.Chapter05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Chapter05 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("sample4.txt", true));
        pw.println("Life is too short");
        pw.println("you need python");
        pw.close();

        ArrayList text = new ArrayList();

        BufferedReader br = new BufferedReader(new FileReader("sample4.txt"));
        while(true){
            String line = br.readLine();
            if (line==null) break;
            text.add(line); 
        }
        br.close();  //생략해도 컴파일 오류없음

        // 줄 단위로 읽으면 줄바꿈 문자가 없어지므로 줄바꿈 문자를 포함한다. 
        String word = String.join("\n", text); 

        // python 이라는 단어를 java로 변경한다.
        word = word.replaceAll("python", "java");

        FileWriter fw = new FileWriter("sample4.txt");
        fw.write(word);
        fw.close();

        while(true){
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line); 
        }
        
        br.close();  //생략해도 컴파일 오류없음

    }
}
